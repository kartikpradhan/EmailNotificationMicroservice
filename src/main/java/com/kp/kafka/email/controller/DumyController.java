package com.kp.kafka.email.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DumyController {

	@GetMapping("get")
	public String getMessage() {
		return "Hello";
	}
}
