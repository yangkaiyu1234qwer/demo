package com.hunktimes.springaop_demo.asepect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // 声明这是一个切面
@Component
public class BeatAspect1 {

	// PointCut 声明切入点(打了AspectAnnotation注解的)
	@Pointcut("@annotation(com.hunktimes.springaop_demo.annotation.AspectAnnotation)")
	public void annotationPointCut() {

	}

	// 在这个切入点上增加通知
	@Before("annotationPointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("===================================================");
		System.out.println("1234~   5678~");
	}
}
