package com.ldh.micro;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Producer 启动类
 * @author Li Dehuan
 * @date 2018年11月7日
 *
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class Producer {

	public static void main(String[] args) {
		
		new SpringApplicationBuilder(Producer.class).web(true).run(args);
		//SpringApplication.run(Producer.class, args);
	}
}
