package com.nirav.lms.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/mail")
public class MailController {
	
	@Autowired()
	
	private MailService ms;
	
	@PostMapping("/send")
	
	public void execute () {
		System.out.println("hello");
		ms.sendmail();
	}
}
