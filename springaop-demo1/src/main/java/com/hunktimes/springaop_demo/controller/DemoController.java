package com.hunktimes.springaop_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hunktimes.springaop_demo.service.DemoService;

@Controller
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping("/index")
	public String hello() {

		demoService.sing("苍茫的天涯是我的爱~");

		demoService.sing("绵绵的青山脚下花正开~");

		return "index";
	}
}
