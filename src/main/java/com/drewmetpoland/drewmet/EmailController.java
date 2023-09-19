package com.drewmetpoland.drewmet;

import jakarta.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/simple-email")
public class EmailController {
	private static final Logger LOG = LoggerFactory.getLogger(EmailController.class);

	@Autowired
	EmailServiceImpl emailService;

	@CrossOrigin
	@RequestMapping(method = RequestMethod.PUT, path = "/{user-email}")
	public @ResponseBody ResponseEntity sendEmail(@PathVariable("user-email") String email) throws MessagingException {
		try {
			emailService.send(email, email, "test TITLE", "test BODY"); // from, to, title, body
		} catch (MailException mailException) {
			LOG.error("Error while sending out email..{}", mailException.getStackTrace());
			return new ResponseEntity<>("Unable to send email", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>("Please check your inbox", HttpStatus.OK);
	}
}
