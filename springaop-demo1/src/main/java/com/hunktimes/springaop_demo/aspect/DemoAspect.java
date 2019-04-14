package com.hunktimes.springaop_demo.aspect;

/**
 * 通过xml来配置拦截器
 * 
 * @author yyyyyy
 *
 */
public class DemoAspect {

	public DemoAspect() {
		super();
		System.out.println("DemoAspect 实例创建");
	}

	public void afterAdvice() {
		System.out.println("yo yo baby go come on~");
		System.out.println("===================================================");
	}

}
