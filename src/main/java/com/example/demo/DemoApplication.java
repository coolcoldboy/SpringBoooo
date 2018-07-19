package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.example.mapper")
@EnableConfigurationProperties
public class DemoApplication extends SpringBootServletInitializer {

//    public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}

}
