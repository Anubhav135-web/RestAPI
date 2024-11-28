package com.jrtp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrtp.AppConstant.MyAppConstant;
import com.jrtp.AppProperties.MyAppProperties;

@RestController
public class MyController {
	@Autowired
	MyAppProperties myProps;
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return myProps.getProps().get(MyAppConstant.WELCOME_MSG);
		
	}
	@GetMapping("/greet")
	public String getGreetMsg() {
		return myProps.getProps().get(MyAppConstant.GREET_MSG);
	}

}
