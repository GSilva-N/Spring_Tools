package com.geral.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello01")
public class Hello_Control_01 {
	
	@GetMapping
	public String hello01() {
		return "Objetivo: Aprender API REST";
	}

}
