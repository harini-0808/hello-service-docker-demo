package com.handson.microservices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//real world routes aren't gonna be like this tho
@RequestMapping("/service1")
public class Controller {
	@GetMapping("/hello")
	public ResponseEntity<?> sayHello(){
		return ResponseEntity.status(200).body("hello service says Hello");
	}
	
	@GetMapping("/square/{number}")
	public ResponseEntity<?> square(@PathVariable int number){
		return ResponseEntity.status(200).body(number*number);
	}
}
