package com.hunktimes.proxy_demo;

import java.lang.reflect.Proxy;

import com.hunktimes.proxy_demo.cglib.InterceptorWithCglibProxy;
import com.hunktimes.proxy_demo.jdk.DemoInvocationHandler;
import com.hunktimes.proxy_demo.service.DemoService;
import com.hunktimes.proxy_demo.service.DemoServiceImpl;

public class App {
	public static void main(String[] args) {
		testJdkProxy();
		System.out.println("=======================");
		testCglibProxy();
	}

	private static void testJdkProxy() {
		// 要代理的目标
		DemoService demoService = new DemoServiceImpl();
		// 织入切面
		DemoInvocationHandler handler = new DemoInvocationHandler(demoService);
		// 目标的类加载器
		ClassLoader classLoader = demoService.getClass().getClassLoader();
		// 目标实现的所有接口
		Class<?>[] interfaces = demoService.getClass().getInterfaces();
		// 创建代理
		DemoService proxy = (DemoService) Proxy.newProxyInstance(classLoader, interfaces, handler);
		proxy.doSomeThing("唱一首歌");
		Class<? extends DemoService> proxyClass = proxy.getClass();
		System.out.println("jdk-proxy-class:" + proxyClass.getName());
		System.out.println("jdk-proxy-superclass:" + proxyClass.getSuperclass().getName());
		System.out.println("jdk-proxy-interfaces:" + proxyClass.getInterfaces());
	}

	private static void testCglibProxy() {
		// 拦截器
		InterceptorWithCglibProxy interceptorWithCglibProxy = new InterceptorWithCglibProxy();
		// 创建代理
		DemoService demoService = (DemoService) interceptorWithCglibProxy.getProxy(DemoServiceImpl.class);
		demoService.doSomeThing("跳一支舞");
		Class<? extends DemoService> proxyClass = demoService.getClass();
		System.out.println("cglib-proxy-class:" + proxyClass.getName());
		System.out.println("cglib-proxy-superclass:" + proxyClass.getSuperclass().getName());
		System.out.println("cglib-proxy-interfaces:" + proxyClass.getInterfaces());
	}
}
