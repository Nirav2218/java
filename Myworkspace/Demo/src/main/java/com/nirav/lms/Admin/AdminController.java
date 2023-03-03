package com.nirav.lms.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AdminController {
	@Autowired
	public AdminDao adao;
	@GetMapping("/{mail}")
	public  Admin read(@PathVariable("mail") String mail){
		return adao.getadmin(mail);
		
	}
}
