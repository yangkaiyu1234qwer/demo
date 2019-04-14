package com.hunktimes.springaop_proxy_demo.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class BeatAdvice2 implements MethodBeforeAdvice, AfterReturningAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("2======动次他次~动次他次~=========");
	}

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("2======yoyo baby go come on~======");
	}

}
