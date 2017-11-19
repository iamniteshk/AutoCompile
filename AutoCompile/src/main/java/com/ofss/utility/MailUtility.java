package com.ofss.utility;

public interface MailUtility {
	void sendMail(String email);
	
	void sendMailAttachment(String logFileName, String resultFileName, String email);
	
	void getFoldersList();
	
	void deleteMail(String subject, boolean all);;
}
