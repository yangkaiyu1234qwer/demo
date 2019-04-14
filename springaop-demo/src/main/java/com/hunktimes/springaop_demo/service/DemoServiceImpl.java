package com.hunktimes.springaop_demo.service;

import org.springframework.stereotype.Service;

/**
 * 业务接口实现
 * 
 * @author yyyyyy
 *
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

	@Override
	public void sing(String words) {
		System.out.println(words);
	}

}
