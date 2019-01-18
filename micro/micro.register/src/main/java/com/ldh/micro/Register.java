package com.ldh.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Register 启动类
 * @author Li Dehuan
 * @date 2018年11月7日
 *
 */
@SpringBootApplication
@EnableEurekaServer			//spring-cloud 服务注解
public class Register {

	public static void main(String[] args) {
		
		//new SpringApplicationBuilder(Register.class).web(true).run(args);
		SpringApplication.run(Register.class, args);
	}
}
