package com.saizhang.rfsys.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.saizhang.rfsys.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	@ResponseBody
	public String login() {
		userService.findAll();
		return "hello world!";
	}
	
	@GetMapping("/list")
	public ResponseEntity<Object> list(){
		return ResponseEntity.ok().body(userService.findAll());
	}
}
