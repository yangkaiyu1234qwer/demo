package com.hunktimes.springaop_proxy_demo.service;

public class DemoServiceImpl3 implements DemoService3 {
	@Override
	public void sing(String words) {
		System.out.println(words + "@@@");
	}
}
