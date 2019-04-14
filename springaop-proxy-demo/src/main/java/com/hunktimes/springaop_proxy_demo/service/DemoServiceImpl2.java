package com.hunktimes.springaop_proxy_demo.service;

public class DemoServiceImpl2 implements DemoService2 {
	@Override
	public void sing(String words) {
		System.out.println(words + "!!!");
	}
}
