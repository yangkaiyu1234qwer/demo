package com.hunktimes.springaop_proxy_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hunktimes.springaop_proxy_demo.service.DemoService2;

@Controller
public class DemoController2 {

	@Autowired
	private DemoService2 demoService2;

	@RequestMapping("/index2")
	public String hello() {

		demoService2.sing("苍茫的天涯是我的爱~");

		demoService2.sing("绵绵的青山脚下花正开~");

		return "index";
	}
}
