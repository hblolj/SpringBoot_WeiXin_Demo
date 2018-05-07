package com.hblolj.wx_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class WxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxDemoApplication.class, args);
	}
}
