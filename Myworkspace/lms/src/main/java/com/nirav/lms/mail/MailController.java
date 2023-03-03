package com.nirav.lms.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirav.lms.User.User;
@RestController
@RequestMapping("/mail")
public class MailController {
	@Autowired()
	private MailService ms;
	
	@PostMapping("/send")
	public void execute (@RequestBody User user) {
		ms.sendmail( user);
		
	}
}
