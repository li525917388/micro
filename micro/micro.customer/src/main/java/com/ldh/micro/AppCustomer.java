package com.ldh.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Ribbon消费者启动类
 * @author Li Dehuan
 * @date 2019年1月17日
 *
 */
//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class AppCustomer {

	public static void main(String[] args) {
		
		//new SpringApplicationBuilder(AppCustomer.class).web(true).run(args);
		SpringApplication.run(AppCustomer.class, args);
	}
}
