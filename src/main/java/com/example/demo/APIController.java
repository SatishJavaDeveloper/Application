package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

@RequestMapping(value = "api/hello", method = RequestMethod.GET)
public String printMessage () {
	
	return "Hello World...................";
}
	
}
