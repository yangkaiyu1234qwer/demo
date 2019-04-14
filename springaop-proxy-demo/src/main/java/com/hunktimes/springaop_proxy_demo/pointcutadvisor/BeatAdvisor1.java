package com.hunktimes.springaop_proxy_demo.pointcutadvisor;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import com.hunktimes.springaop_proxy_demo.service.DemoServiceImpl1;

// 静态方法匹配切面，可以按类+方法名过滤来匹配切入点
public class BeatAdvisor1 extends StaticMethodMatcherPointcutAdvisor {
	private static final long serialVersionUID = -5156102640600560184L;

	// 按方法名匹配
	@Override
	public boolean matches(Method method, Class<?> clazz) {
		return DemoServiceImpl1.class.isAssignableFrom(clazz) && "sing".equals(method.getName());
	}

}
