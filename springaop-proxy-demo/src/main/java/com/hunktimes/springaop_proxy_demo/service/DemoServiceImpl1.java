package com.hunktimes.springaop_proxy_demo.service;

public class DemoServiceImpl1 implements DemoService1 {
	@Override
	public void sing(String words) {
		System.out.println(words + "~~~");
	}
}
