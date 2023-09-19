package com.drewmetpoland.drewmet;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailServiceInterface {

	private JavaMailSender mailSender;

	@Autowired
	public EmailServiceImpl(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Override
	public void send(String from, String to, String title, String body) {
		// TODO Auto-generated method stub
		MimeMessage message = this.mailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message);

		System.out.println("++++++++\n" + from + "\n" + to + "\n" + title + "\n" + body + "\n" + "++++++++\n");

		try {
			if (from != null) {
				mimeMessageHelper.setFrom(from);
			}
			mimeMessageHelper.setSubject(title);
			mimeMessageHelper.setText(body);
			mimeMessageHelper.setTo(to);
			this.mailSender.send(message);
		} catch (MessagingException messageException) {
			throw new RuntimeException(messageException);
		}
	}
}
