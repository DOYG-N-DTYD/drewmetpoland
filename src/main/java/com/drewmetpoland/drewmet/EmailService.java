package com.drewmetpoland.drewmet;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;


@Service
public class EmailService {
      @Autowired
      private JavaMailSender mailSender;

      public void sendEmail(String toAddress, String subject, String message) throws MessagingException{ //String to, String subject, String body
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //simpleMailMessage.setFrom("SPRING BOOT");
        simpleMailMessage.setTo(toAddress);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);
        mailSender.send(simpleMailMessage);
        System.out.println("OK SENDED");

      }
      // @Override
      // public void sendEmailWithAttachment(String toAddress, String subject, String message, String attachment) throws MessagingException, FileNotFoundException {

      //   MimeMessage mimeMessage = mailSender.createMimeMessage();
      //   MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
      //   messageHelper.setTo(toAddress);
      //   messageHelper.setSubject(subject);
      //   messageHelper.setText(message);
      //   FileSystemResource file = new FileSystemResource(ResourceUtils.getFile(attachment));
      //   messageHelper.addAttachment("Purchase Order", file);
      //   mailSender.send(mimeMessage);
      // }
}
