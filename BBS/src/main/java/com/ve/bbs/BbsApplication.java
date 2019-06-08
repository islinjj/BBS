package com.ve.bbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ve.controller,com.ve.entity")
@MapperScan(basePackages = {"com.ve.mapper"})
public class BbsApplication {
	public static void main(String[] args) {
		SpringApplication.run(BbsApplication.class, args);
	}

}
