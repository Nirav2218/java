package com.nirav.lms.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	public UserRepository urepo;
	
	public int UserInsert (User u) {
		return urepo.Insert(u);
		
		
	}
	
}
