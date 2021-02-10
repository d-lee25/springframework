package com.luv2code.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * using this class will no longer require using the xml to configure the bean factory
 */

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class AnnotationConfig {


	
	
}
