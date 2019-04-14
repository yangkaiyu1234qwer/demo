package com.hunktimes.springaop_demo.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * WebApplicationInitializer是spring提供用来配置servlet 3.0+配置的接口，从而实现替代web.xml的位置。
 * 实现此接口会自动被SpringServletContainerInitializer获取到
 * 
 * @author yyyyyy
 */
public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// 新建WebApplicationContext，注册配置类，并将其和当前servletContext关联
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(MyConfiguration.class);
		ctx.setServletContext(servletContext);

		// 注册springMVC的DispatcherServlet
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}

}
