package com.hunktimes.proxy_demo.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 基于jdk动态代理的切面      代理谁？--target  做些什么？--invoke方法实现增强
public class DemoInvocationHandler implements InvocationHandler {
	// 被代理的对象
	private Object target;

	public DemoInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	// proxy是使用jdk反射创建的代理
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 前置处理
		System.out.println("jdk动态代理-前置处理...");
		// 原调用
		method.invoke(target, args);
		// 后置处理
		System.out.println("jdk动态代理-后置处理...");
		return null;
	}
}
