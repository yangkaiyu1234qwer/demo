package com.hunktimes.springaop_proxy_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hunktimes.springaop_proxy_demo.service.DemoService3;

@Controller
public class DemoController3 {

	@Autowired
	private DemoService3 demoService3;

	@RequestMapping("/index3")
	public String hello() {

		demoService3.sing("苍茫的天涯是我的爱~");

		demoService3.sing("绵绵的青山脚下花正开~");

		return "index";
	}
}
