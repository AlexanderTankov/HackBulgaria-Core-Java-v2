package Problem1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail{

	public static void main(String[] args) throws EmailException, IOException {
		File file = new File(".pass.txt");
		BufferedReader brTest = new BufferedReader(new FileReader(file));
		String text = brTest.readLine();
		Email email = new SimpleEmail();
		
		//because i don't have strong pass this crash
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("alexandartankov@gmail.com", text));
		email.setSSLOnConnect(true);
		email.setFrom("AlexandarTankov@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("ivan.bsto@gmail.com");
		email.send();
	}
}
