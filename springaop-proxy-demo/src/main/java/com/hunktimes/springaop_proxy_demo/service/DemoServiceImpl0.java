package com.hunktimes.springaop_proxy_demo.service;

/**
 * 业务接口实现
 * 
 * @author yyyyyy
 *
 */
public class DemoServiceImpl0 implements DemoService0 {

	@Override
	public void sing(String words) {
		System.out.println(words);
	}

}
