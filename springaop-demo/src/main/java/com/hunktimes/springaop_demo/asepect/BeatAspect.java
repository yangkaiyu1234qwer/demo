package com.hunktimes.springaop_demo.asepect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 动次他次拦截器
 * 
 * @author yyyyyy
 *
 */
@Aspect // 声明这是一个切面
@Component
public class BeatAspect {

	// 通过execution指定切入点，joinPoint可以获取调用
	@Before(value = "execution(* com.hunktimes.springaop_demo.service.DemoService.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("===================================================");
		System.out.println("动词他次~   动词他次~");

		Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
		Object[] args = joinPoint.getArgs();
		Object target = joinPoint.getTarget();

		System.out.println("method=" + method.getName());
		System.out.println("args=" + Arrays.toString(args));
		System.out.println("target=" + target.toString());
	}
}
