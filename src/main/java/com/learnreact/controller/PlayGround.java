package com.learnreact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayGround {
	
	@GetMapping("helloworld")
	public String helloworld() {
		return "helloworld";
	}

}
