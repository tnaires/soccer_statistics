package com.uninassau.soccer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
	@RequestMapping("/")
	public String home() {
		return "Home page";
	}
}
