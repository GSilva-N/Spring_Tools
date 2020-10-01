package com.geral.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class Hello_control {
	
	@GetMapping
	public String hello() {
		return "Mentalidade de crescimento e Persistência";
	}

}
