package com.hunktimes.springaop_demo.aspect;

import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class DemoAdvisor extends DefaultIntroductionAdvisor {

	public DemoAdvisor(Advice advice) {
		super(advice);
		// TODO Auto-generated constructor stub
	}

}
