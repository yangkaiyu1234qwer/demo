package com.hunktimes.springaop_demo.service;

import org.springframework.stereotype.Service;

import com.hunktimes.springaop_demo.annotation.AspectAnnotation;

/**
 * 业务接口实现
 * 
 * @author yyyyyy
 *
 */
@Service("demoService1")
public class DemoServiceImpl1 implements DemoService1 {

	@Override
	@AspectAnnotation
	public void sing(String words) {
		System.out.println(words);
	}

}
