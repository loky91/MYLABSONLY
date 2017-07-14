package com.jlcindia.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object obj, String bname) throws BeansException {
		
		System.out.println("post-processor-after-initialization"+bname);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String bname) throws BeansException {
	

		System.out.println("post-processor-before-initialization"+bname);
		return obj;
	}

	
	
	
}
