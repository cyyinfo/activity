package com.cyy.activity.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.cyy.activity.mapper")
@ComponentScan("com.cyy.activity")
@EnableTransactionManagement
public class ActivityWebApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ActivityWebApplication.class, args);
	}
}
