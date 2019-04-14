package com.hunktimes.springaop_proxy_demo.service;

public class DemoServiceImpl implements DemoService {
	@Override
	public void sing(String words) {
		System.out.println(words + "~！@#￥%");
	}
}
