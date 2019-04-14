package com.hunktimes.springaop_proxy_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hunktimes.springaop_proxy_demo.service.DemoService1;

@Controller
public class DemoController1 {

	@Autowired
	private DemoService1 demoService1;

	@RequestMapping("/index1")
	public String hello() {

		demoService1.sing("苍茫的天涯是我的爱~");

		demoService1.sing("绵绵的青山脚下花正开~");

		return "index";
	}
}
