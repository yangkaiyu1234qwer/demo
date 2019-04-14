package com.hunktimes.proxy_demo.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

// 基于cglib创建代理的切面    拦截谁？--getProxy的入参clazz类;   做什么？--intercept方法实现增强
public class InterceptorWithCglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer(); // enhancer=增强子;强化剂;增加者

	public Object getProxy(Class<?> clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();// 为被代理类创建一个代理，其类型继承自被代理类
	}

	// 拦截操作 怎么拦截的？ 通过使用cglib为目标创建代理来达到拦截并增强的功能
	public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		// 前置拦截
		System.out.println("cglib代理-前置拦截...");
		// 原调用
		methodProxy.invokeSuper(target, args);
		// 后置拦截
		System.out.println("cglib代理-后置拦截...");
		return null;
	}
}
