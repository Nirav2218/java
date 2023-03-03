package com.nirav.lms.mail;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class MailService {
    
	public void sendmail() {
        String to = "dhimmarnirav22@gmail.com"; 
        String from = "nirav.dhimmar@agami-tech.com"; 
        String host = "smtp.gmail.com"; 

        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");

       
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "zpxkzpeocxooqfdl"); 
            }
        });

        try {
            // create a default MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // set From: header field of the header
            message.setFrom(new InternetAddress(from));

            // set To: header field of the header
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // set Subject: header field
            message.setSubject("This is the Subject Line!");

            // set the actual message
            message.setText("This is a test email from Java using javax mail API!");

            // send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
