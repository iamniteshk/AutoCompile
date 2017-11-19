package com.ofss.utility;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.activation.MimetypesFileTypeMap;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.sun.mail.imap.protocol.FLAGS;

public class MailUtilities implements MailUtility {

	static Properties prop;
	static InputStream inputStream;
	private static String user;
	private static String password;
	private static String imapHost;
	Session session;

	static {
		String propFileName = "mail.properties";
		try {
			prop = new Properties();
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			inputStream = loader.getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}

			user = prop.getProperty("user");
			password = prop.getProperty("password");
			imapHost = prop.getProperty("mail.imap.host");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MailUtilities() {
		session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});
	}

	@Override
	public void sendMail(String email) {
		// TODO Auto-generated method stub

		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject("Message Alert");

			// create MimeBodyPart object and set your message text
			BodyPart messageBodyPart1 = new MimeBodyPart();

			messageBodyPart1.setText(
					"This is an Auto Generated Mail. In case of any issues please write a mail to Nitesh.z.kumar@oracle.com \n\n Note: Due to compatibility issue with outlook or zimbra in sending the original class file we are sending in zip format.");

			// create Multipart object and add MimeBodyPart objects to this object
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);

			// set the multiplart object to the message object
			message.setContent(multipart);

			// send message
			Transport.send(message);

			System.out.println("Message sent...");
			// Copy message to "Sent Items" folder as read

			appendToSent(message);

			System.out.println("message saved....");

		} catch (MessagingException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void sendMailAttachment(String logFileName, String resultFileName, String email) {
		// TODO Auto-generated method stub
		System.out.println("logFileName--> " + logFileName);
		System.out.println("resultFileName--> " + resultFileName);

		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject("Message Alert");

			// create MimeBodyPart object and set your message text
			BodyPart messageBodyPart1 = new MimeBodyPart();

			messageBodyPart1.setText(
					"This is an Auto Generated Mail. In case of any issues please write a mail to Nitesh.z.kumar@oracle.com \n\n Note: Due to compatibility issue with outlook or zimbra in sending the original class file we are sending in zip format.");

			// create new MimeBodyPart object and set DataHandler object to this object
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			String attachment1 = logFileName;// change accordingly
			DataSource source1 = new FileDataSource(attachment1);
			messageBodyPart2.setDataHandler(new DataHandler(source1));
			messageBodyPart2.setFileName(attachment1);

			MimeBodyPart messageBodyPart3 = new MimeBodyPart();

			String attachment2 = resultFileName;// change accordingly
			MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
			String mimeType = mimeTypesMap.getContentType(attachment2);
			System.out.println("mimeType--> " + mimeType);
			DataSource source2 = new FileDataSource(attachment2);
			messageBodyPart3.setDataHandler(new DataHandler(source2));
			messageBodyPart3.setFileName(attachment2);

			// create Multipart object and add MimeBodyPart objects to this object
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);
			multipart.addBodyPart(messageBodyPart2);
			multipart.addBodyPart(messageBodyPart3);

			// set the multiplart object to the message object
			message.setContent(multipart);

			// send message
			Transport.send(message);

			System.out.println("Message sent...");
			// Copy message to "Sent Items" folder as read
			appendToSent(message);

			System.out.println("message saved....");

		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void getFoldersList() {
		// TODO Auto-generated method stub
		try {
			Store store = session.getStore("imaps");
			store.connect(imapHost, user, password);
			javax.mail.Folder[] folders = store.getDefaultFolder().list("*");
			for (javax.mail.Folder folder : folders) {
				if ((folder.getType() & javax.mail.Folder.HOLDS_MESSAGES) != 0) {
					System.out.println(folder.getFullName() + ": " + folder.getMessageCount());
				}
			}
		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteMail(String subject, boolean all) {
		// TODO Auto-generated method stub

		try {
			Store store = session.getStore("imaps");
			store.connect(imapHost, user, password);

			// opens the Sent Items folder
			Folder folderInbox = store.getFolder("Sent Items");

			if (!folderInbox.exists()) {
				System.out.println("Sent Items not found");
				System.exit(0);
			}

			folderInbox.open(Folder.READ_ONLY);

			// fetches new messages from server
			Message[] arrayMessages = folderInbox.getMessages();

			for (int i = 0; i < arrayMessages.length; i++) {
				Message message = arrayMessages[i];
				String subject1 = message.getSubject();
				if (subject1 == null) {
					System.out.println("inside null");
					continue;
				} else if (subject1.contains(subject)) {
					message.setFlag(Flags.Flag.DELETED, true);
					System.out.println("Marked DELETE for message: " + subject1);
				}
			}

			// expunges the folder to remove messages which are marked deleted boolean
			boolean expunge = true;
			folderInbox.close(expunge);

			// disconnect
			store.close();

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	private void appendToSent(MimeMessage message) {
		// Copy message to "Sent Items" folder as read
		Store store;
		try {
			store = session.getStore("imaps");
			store.connect(imapHost, user, password);

			Folder folder = (Folder) store.getFolder("Sent Items");
			if (!folder.exists()) {
				folder.create(Folder.HOLDS_MESSAGES);
			}
			folder.open(Folder.READ_WRITE);
			System.out.println("appending...");

			folder.appendMessages(new Message[] { message });
			// Message[] msgs = folder.getMessages();
			message.setFlag(FLAGS.Flag.RECENT, true);
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
