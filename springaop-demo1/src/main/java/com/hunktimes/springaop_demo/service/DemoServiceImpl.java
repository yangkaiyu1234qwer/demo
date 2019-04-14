package com.hunktimes.springaop_demo.service;

/**
 * 业务接口实现
 * 
 * @author yyyyyy
 *
 */
// @Service
public class DemoServiceImpl implements DemoService {

	@Override
	public void sing(String words) {
		System.out.println(words);
	}

}
