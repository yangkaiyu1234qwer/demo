package com.hunktimes.springaop_demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration // 声明当前类是一个配置类，类似xml文件
@EnableWebMvc // EnableWebMvc注解会开启一些默认配置,比如 ViewResolver
@EnableAspectJAutoProxy // 开启aspectJ注解
@ComponentScan("com.hunktimes.springaop_demo") // 自动扫描注解的包路径
public class MyConfiguration {

	/**
	 * 配置一个JSP的ViewResolver,ViewResolver是SpringMVC视图渲染的核心机制，
	 * 实现这个接口要重写方法resolveViewName()，这个方法的返回值是接口View，
	 * 而View的职责就是使用model、request、response对象，并将渲染的视图返回给浏览器
	 */
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
}
