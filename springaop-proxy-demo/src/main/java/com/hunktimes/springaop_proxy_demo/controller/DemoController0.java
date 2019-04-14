package com.hunktimes.springaop_proxy_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hunktimes.springaop_proxy_demo.service.DemoService0;

@Controller
public class DemoController0 {

	@Autowired
	private DemoService0 demoService0;

	@RequestMapping("/index0")
	public String hello() {

		demoService0.sing("苍茫的天涯是我的爱~");

		demoService0.sing("绵绵的青山脚下花正开~");

		return "index";
	}
}
