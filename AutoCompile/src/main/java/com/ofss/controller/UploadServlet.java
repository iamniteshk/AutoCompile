package com.ofss.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.ofss.processor.CompileException;
import com.ofss.processor.MultipleClassProcessor;

/**
 * Servlet implementation class UploadServlet
 */
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String DATA_DIRECTORY = "D:\\AutoCompile\\Temp\\uploaded\\" + System.currentTimeMillis();
	private static final int MAX_MEMORY_SIZE = 1024 * 1024 * 2;
	private static final int MAX_REQUEST_SIZE = 1024 * 1024;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(5 * 60);

		String path = "";
		String path2 = "";
		String path3 = "";
		String path4 = "";
		String version = "";
		String jdk = "";
		String email = "";
		String finalPath = "";
		ArrayList<String> pathList = new ArrayList<>();

		// Check that we have a file upload request
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		if (!isMultipart) {
			return;
		}

		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Sets the size threshold beyond which files are written directly to
		// disk.
		factory.setSizeThreshold(MAX_MEMORY_SIZE);

		// Sets the directory used to temporarily store files that are larger
		// than the configured size threshold. We use temporary directory for
		// java
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

		// constructs the folder where uploaded file will be stored
		String uploadFolder = DATA_DIRECTORY;

		// create the directory in upload folder
		File directory = new File(uploadFolder);
		if (!directory.exists()) {
			directory.mkdir();
		}

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Set overall request size constraint
		upload.setSizeMax(MAX_REQUEST_SIZE);

		try {
			// Parse the request
			List<FileItem> items = upload.parseRequest(request);
			Iterator<FileItem> iter = items.iterator();
			while (iter.hasNext()) {
				FileItem item = (FileItem) iter.next();

				if (!item.isFormField()) {
					String fileName = new File(item.getName()).getName();
					String filePath = uploadFolder + File.separator + fileName;
					File uploadedFile = new File(filePath);
					System.out.println(filePath);
					// saves the file to upload directory
					try {
						item.write(uploadedFile);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					String name = item.getFieldName();// request.getParameter("svnPath");
					switch (name) {
					case "svnPath":
						path = item.getString().trim();
						break;
					case "svnPath2":
						path2 = item.getString().trim();
						break;
					case "svnPath3":
						path3 = item.getString().trim();
						break;
					case "svnPath4":
						path4 = item.getString().trim();
						break;
					case "version":
						version = item.getString();
						break;
					case "jdk":
						jdk = item.getString();
						break;
					case "email":
						email = item.getString();
						break;
					}
				}
			}

			System.out.println("path--> " + path);
			System.out.println("path2--> " + path2);
			System.out.println("path3--> " + path3);
			System.out.println("path4--> " + path4);
			System.out.println("version--> " + version);
			System.out.println("jdk--> " + jdk);
			System.out.println("email--> " + email);

			session.setAttribute("user_id", email);

			if (path.contains("/")) {
				path = path.replaceAll("/", "\\\\");
			}

			if (path2.contains("/")) {
				path2 = path2.replaceAll("/", "\\\\");
			}

			if (path3.contains("/")) {
				path3 = path3.replaceAll("/", "\\\\");
			}

			if (path4.contains("/")) {
				path4 = path4.replaceAll("/", "\\\\");
			}

			System.out.println("path--> " + path);
			System.out.println("path2--> " + path2);
			System.out.println("path3--> " + path3);
			System.out.println("path4--> " + path4);
			
			System.out.println("path2--> " + path2== null);
			System.out.println("path3--> " + path3==null);
			System.out.println("path4--> " + path4==null);
			
			System.out.println("path2--> " + path2.isEmpty());
			System.out.println("path3--> " + path3.isEmpty());
			System.out.println("path4--> " + path4.isEmpty());

			/*
			 * @SuppressWarnings("resource") Scanner sc = new
			 * Scanner(finalPath).useDelimiter(";");
			 * 
			 * while (sc.hasNext()) { pathList.add(sc.next()); }
			 * 
			 * sc.close();
			 */

			pathList.add(path);

			if (path2 != null && !path2.isEmpty())
				pathList.add(path2);

			if (path3 != null && !path3.isEmpty())
				pathList.add(path3);

			if (path4 != null && !path4.isEmpty())
				pathList.add(path4);

			pathList.forEach(pathName -> System.out.println(pathName));

			System.out.println("before creating new instance of cp");

			// ClassProcessor cp = new ClassProcessor();

			MultipleClassProcessor mcp = new MultipleClassProcessor(version);

			System.out.println("before calling process method of mcp");

			// cp.process(finalPath, version, jdk, email);

			mcp.process(pathList, uploadFolder, version, jdk, email);

			 getServletContext().getRequestDispatcher("/done.jsp").forward(request,response);

			/*out.println("<script type=\"text/javascript\">");
			out.println(
					"alert('Your file has been uploaded! You will soon recieve an email containing the log file and class files or java files(in case of error) shortly');");
			out.println("location='index.jsp';");
			out.println("</script>");*/

		} catch (FileUploadException | CompileException ex) {
			try {
				throw new CompileException("nitesh");
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
