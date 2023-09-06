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
    EmailService emailService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.PUT, path = "/{user-email}")

    public @ResponseBody ResponseEntity sendEmail(@PathVariable("user-email") String email) throws MessagingException {
    	System.out.println("API API");
    	try {
        	System.out.println(email + " !!!! ");
            emailService.sendEmail(email, "FROM SPRING", "This is a welcome email for your!!");
        } catch (MailException mailException) {
            LOG.error("Error while sending out email..{}", mailException.getStackTrace());
            return new ResponseEntity<>("Unable to send email", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Please check your inbox", HttpStatus.OK);   
    }
    //  @GetMapping(value = "/simple-order-email/{user-email}")
    // public @ResponseBody ResponseEntity sendEmailAttachment(@PathVariable("user-email") String email) {

    //     try {
    //         emailService.sendEmailWithAttachment(email, "Order Confirmation", "Thanks for your recent order",
    //                 "classpath:purchase_order.pdf");
    //     } catch (MessagingException | FileNotFoundException mailException) {
    //         LOG.error("Error while sending out email..{}", mailException.getStackTrace());
    //         return new ResponseEntity<>("Unable to send email", HttpStatus.INTERNAL_SERVER_ERROR);
    //     }

    //     return new ResponseEntity<>("Please check your inbox for order confirmation", HttpStatus.OK);
    // }
}
