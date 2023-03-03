package com.nirav.lms.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	public UserService userv;
	@PostMapping("/insert")
	public void save(@RequestBody User u) {
		userv.UserInsert(u);
	}
	@PostMapping("/update")
	public void update(@RequestBody User u) {
		userv.UserUpdate(u);
	}
	@PostMapping("/read")
	public int read(@RequestBody User u) {
		return userv.UserRead(u);
	}
}
