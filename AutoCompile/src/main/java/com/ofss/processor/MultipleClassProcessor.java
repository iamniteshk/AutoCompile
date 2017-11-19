package com.ofss.processor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletException;

import com.ofss.utility.ApplicationGlobal;
import com.ofss.utility.MailUtilities;

public class MultipleClassProcessor {

	InputStream inputStream;
	static Properties prop;
	static InputStream iStream;

	public MultipleClassProcessor(String version) {
		/*String propFileName = version + "_files.properties";
		try {
			prop = new Properties();
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			iStream = loader.getResourceAsStream(propFileName);

			if (iStream != null) {
				prop.load(iStream);
			} else {
				throw new CompileException("property file '" + propFileName + "' not found in the classpath");
			}

		} catch (Exception e) {
			//e.printStackTrace();
			try {
				throw new CompileException("property file '" + propFileName + "' not found in the classpath");
			} catch (ServletException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}*/
	}

	public void process(List<String> filePathList, String uploadedPath, String version, String jdk, String email) throws CompileException {

		System.out.println("coming inside process");

		ProcessBuilder builder;
		String projectName;
		String fileName;
		String finalFilePath;
		String sourcePath;
		String cpsourceFile;
		String classfile;
		String classPath;
		String jobPath;
		String uploadedFile;

		final String pathPrefix = "D:\\share\\Java Sources\\" + version + "\\";
		final String backupSource = "D:\\AutoCompile\\Temp\\backup\\" + version;
		final String zipFileName = "out_" + System.currentTimeMillis() + ".zip";
		final String mailPath = "D:\\AutoCompile\\Temp\\mail\\" + zipFileName;
		final String name = "log_" + System.currentTimeMillis() + ".txt";
		final String logFilePath = "D:\\AutoCompile\\Logfile\\" + name;
		String lockFile;

		boolean chk1 = true; // processing should happen even backup is not required
		
		MailUtilities mutil = new MailUtilities();

		InputStream inStream = null;
		ZipOutputStream zos = null;
		FileOutputStream fos = null;
		PrintStream console = System.out;

		try {
			PrintStream o = new PrintStream(new File(logFilePath));
			System.setOut(o);
			System.setErr(o);

			fos = new FileOutputStream(mailPath, true);
			zos = new ZipOutputStream(fos);

		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			try {
				throw new ServletException(e.getMessage());
			} catch (ServletException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		for (String str : filePathList) {
			System.out.println("processing file--> " + str);
			
			str = ApplicationGlobal.getProps(version).getProperty(str);
			
			//str = prop.getProperty(str);
			
			if (str.contains("/")) {
				str = str.replaceAll("/", "\\\\");
			}
			
			System.out.println("found file path as---> " + str);
			
			projectName = str.substring(0, str.indexOf("\\"));
			
			System.out.println("Project Name--> " + projectName);
			
			/*if(projectName.equalsIgnoreCase("FCJUtility") && !version.equalsIgnoreCase("12.0.3")){
				String temp = str.substring(str.indexOf("\\"));
				System.out.println(temp);
				System.out.println(projectName + "\\src" + temp);
				str = projectName + "\\src" + temp;
				System.out.println(str);
			}*/

			int beginIndex = str.lastIndexOf("\\");
			System.out.println("coming after begin index--> " + beginIndex);

			fileName = str.substring(beginIndex + 1);

			System.out.println("fileName---> " + fileName);

			lockFile = "D:\\AutoCompile\\Temp\\uploaded" + File.separator + version + jdk + fileName + ".lck";

			System.out.println("created lock file name as ---> " + lockFile);

			File lck = new File(lockFile);

			while (lck.exists()) {
				try {
					System.out.println("File is locked by another user..plz wait for sometime");
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					lck.delete();
				}
			}

			if (!lck.exists()) {
				try {
					lck.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					lck.delete();
				}
			}

			uploadedFile = uploadedPath + File.separator + fileName;

			System.out.println("uploadedFile---> " + uploadedFile);

			sourcePath = pathPrefix + str;
			System.out.println("sourcePath---> " + sourcePath);

			cpsourceFile = sourcePath.substring(0, sourcePath.lastIndexOf("\\"));

			System.out.println("cpsourceFile---> " + cpsourceFile);

			File fChk = new File(backupSource + File.separator + fileName);

			if (!fChk.exists()) {
				System.out.println("File wasn't backed up earlier..so taking backup");

				try {
					chk1 = this.copyFile(sourcePath, backupSource, lck);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					throw new CompileException(e.getMessage());
				}
			}

			if (chk1) {
				System.out.println("backup is successful..lets start processing");

				System.out.println("First copy the uplodaed file to sourcepath");


				boolean chk2;
				try {
					chk2 = this.copyFile(uploadedFile, cpsourceFile, lck);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					throw new CompileException(e1.getMessage());
				}

				System.out.println("replaced the source file with uploaded file--> " + chk2);

				//projectName = str.substring(0, str.indexOf("\\"));
				System.out.println("Project Name--> " + projectName);

				// for DAO classes
				if (projectName.contains("Dao")) {
					finalFilePath = str.replaceAll("src", "classes").replace("sqlj", "java").replaceFirst("java",
							"sqlj");
					System.out.println("finalFilePath--> " + finalFilePath);

					System.out.println("sourcePath---> " + sourcePath);

					classfile = finalFilePath.replaceAll("java", "class");

					System.out.println("classfile--> " + classfile);

					classPath = pathPrefix + classfile;
					System.out.println("classPath--> " + classPath);

					jobPath = "D:\\AutoCompile\\" + version + "\\" + jdk + "\\" + projectName + "\\auto.bat";
					System.out.println("job file path--> " + jobPath);

					builder = new ProcessBuilder("cmd.exe", "/c", jobPath + " " + str + " " + finalFilePath);

				} else if (projectName.equals("ELCMKernelSQLJ")) {
					finalFilePath = str.replaceAll("src", "classes").replace(".sqlj", ".java");
					System.out.println("finalFilePath--> " + finalFilePath);

					System.out.println("sourcePath---> " + sourcePath);

					classfile = finalFilePath.replaceAll("java", "class");

					System.out.println("classfile--> " + classfile);

					classPath = pathPrefix + classfile;
					System.out.println("classPath--> " + classPath);

					jobPath = "D:\\AutoCompile\\" + version + "\\" + jdk + "\\" + projectName + "\\auto.bat";
					System.out.println("job file path--> " + jobPath);

					builder = new ProcessBuilder("cmd.exe", "/c", jobPath + " " + str + " " + finalFilePath);

				} else {

					sourcePath = pathPrefix + str;

					System.out.println("sourcePath---> " + sourcePath);

					if (projectName.equalsIgnoreCase("FCJBatch")) {
						classfile = str.replaceAll("src", "FcjBatchclasses").replaceAll("java", "class");
						System.out.println("classfile--> " + classfile);
					} else if (projectName.equalsIgnoreCase("FCJCoreDAOOracle")) {
						classfile = str.replace("com", "\\FCJCoreDAOClasses\\com").replaceAll("java", "class");
						System.out.println("classfile--> " + classfile);
					} else if (projectName.equalsIgnoreCase("FCJGeneralEJB")) {
						classfile = str.replace("src", "FCJGenaralclasses").replaceAll("java", "class");
						System.out.println("classfile--> " + classfile);
					} else if (projectName.equalsIgnoreCase("FCJNeoWeb")) {
						classfile = str.replace("Javasource", "buildFCJNeoWebClasses").replaceAll("java", "class");
						System.out.println("classfile--> " + classfile);
					} else if (projectName.equalsIgnoreCase("FCJSMS")) {
						classfile = str.replace("src", "FCJSMSclasses").replaceAll("java", "class");
						System.out.println("classfile--> " + classfile);
					} else if (projectName.equalsIgnoreCase("FCJUtility") && version.equalsIgnoreCase("12.0.3")) {
						classfile = str.replace("com\\ofss", "FCJUtilityClasses\\com\\ofss").replaceAll("java",
								"class");
						System.out.println("classfile--> " + classfile);
					} else {

						classfile = str.replaceAll("src", "classes").replaceAll("java", "class");
						System.out.println("classfile--> " + classfile);
					}

					classPath = pathPrefix + classfile;
					System.out.println("classPath--> " + classPath);

					jobPath = "D:\\AutoCompile\\" + version + "\\" + jdk + "\\" + projectName + "\\auto.bat";
					System.out.println("job file path--> " + jobPath);

					builder = new ProcessBuilder("cmd.exe", "/c", jobPath + " " + str);
				}

				builder.redirectErrorStream(true);
				Process p;

				try {
					p = builder.start();
					BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
					String line;
					while (true) {

						line = r.readLine();
						if (line == null) {
							break;
						}
						System.out.println(line);
					}

					int returnCode = p.waitFor();
					System.out.println("Return code = " + returnCode);

					if (returnCode == 0) {
						System.out.println("Compiled successfully..sending the log file and class file to user");

						try {

							this.copyFile(classPath, uploadedPath, lck);
							String classfileName;
							if (fileName.contains(".sqlj")) {

								classfileName = uploadedPath + File.separator + fileName.replace("sqlj", "class");
							} else {
								classfileName = uploadedPath + File.separator + fileName.replace("java", "class");
							}

							System.out.println("classfileName---> " + classfileName);

							File afile = new File(classfileName);

							System.out.println("afile--> " + afile.getName());

							inStream = new FileInputStream(afile);

							// add a new Zip Entry to the ZipOutputStream
							ZipEntry ze = new ZipEntry(afile.getName());
							zos.putNextEntry(ze);

							byte[] buffer = new byte[1024];

							int length;
							// copy the file content in bytes
							while ((length = inStream.read(buffer)) > 0) {
								zos.write(buffer, 0, length);
							}

							inStream.close();

							System.out.println("File is copied successfully!");
							System.out.println(afile.getCanonicalPath() + " is zipped to " + zipFileName);

							System.out.println("path--> " + mailPath);

							System.out.println("deleting the temp files");
							File u = new File(uploadedFile);
							u.delete();
							afile.delete();

						} catch (IOException e) {
							e.printStackTrace();
							lck.delete();
						}

					} else if (returnCode == 1) {
						System.out.println("Compilation error..sending the log file and uplodaed java file to user");

						try {
							File afile = new File(uploadedFile);

							System.out.println("afile--> " + afile.getName());

							inStream = new FileInputStream(afile);

							// add a new Zip Entry to the ZipOutputStream
							ZipEntry ze = new ZipEntry(afile.getName());
							zos.putNextEntry(ze);

							byte[] buffer = new byte[1024];

							int length;
							// copy the file content in bytes
							while ((length = inStream.read(buffer)) > 0) {
								zos.write(buffer, 0, length);
							}

							inStream.close();

							System.out.println("File is copied successfully!");

							System.out.println(afile.getCanonicalPath() + " is zipped to " + zipFileName);

							System.out.println("path--> " + mailPath);

							System.out.println("deleting the temp files");

							File u = new File(uploadedFile);

							boolean chk3 = this.copyFile(backupSource + "//" + fileName, cpsourceFile,lck);
							if (chk3) {
								File b = new File(backupSource + "//" + fileName);
								b.delete();
							}
							u.delete();

						} catch (IOException e) {
							e.printStackTrace();
							lck.delete();
						}
					} // else if(returncode == 2){"send mail to nitesh.z.kumar@oracle.com for this
						// bug."}

					lck.delete();

				} catch (IOException | InterruptedException e) {
					e.printStackTrace();
					lck.delete();
				}
			}
		}

		System.setOut(console);
		System.setErr(console);

		// Close the zip entry to write to zip file
		try {
			File del_upload = new File(uploadedPath);
			System.out.println("deleting the uploaded temp directory..... " + del_upload.getName());
			del_upload.delete();

			zos.closeEntry();
			zos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("all processing is done. Now sending the mail to the user");
		mutil.sendMailAttachment(logFilePath, mailPath, email);

		System.out.println("deleting the mail file");
		File m = new File(mailPath);
		m.delete();
		System.out.println("processing done.");
	}

	private boolean copyFile(String source, String destination, File lck) throws FileNotFoundException {

		System.out.println(source);
		System.out.println(destination);

		File f1 = new File(source);
		String backupName = f1.getName();
		File f2 = new File(destination + "//" + backupName);
		System.out.println(f2.getName());
		
		InputStream ins = null;
		OutputStream ous = null;

		try {
			ins = new FileInputStream(f1);
			ous = new FileOutputStream(f2, false);

			byte[] buffer = new byte[1024];
			int length;

			// copy the file content in bytes
			while ((length = ins.read(buffer)) > 0) {
				ous.write(buffer, 0, length);
				ous.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			lck.delete();
			return false;
		} finally {
			try {
				ous.close();
				ins.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
}
