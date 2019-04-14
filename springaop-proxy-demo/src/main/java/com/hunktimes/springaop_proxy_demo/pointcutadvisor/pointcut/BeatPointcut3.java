package com.hunktimes.springaop_proxy_demo.pointcutadvisor.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.hunktimes.springaop_proxy_demo.service.DemoServiceImpl3;

public class BeatPointcut3 extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clazz, Object[] args) {
		boolean isMatch = DemoServiceImpl3.class.isAssignableFrom(clazz) 
				&& "sing".equals(method.getName())
				&& ((String) args[0]).contains("苍茫的天涯是我的爱~");
		return isMatch;
	}

}
