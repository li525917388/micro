package com.ldh.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心server
 * @author Li Dehuan
 * @date 2019年1月21日
 *
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class AppConfigServer {
    
	public static void main(String[] args) {
		System.out.println("正在启动配置中心...");
		SpringApplication.run(AppConfigServer.class, args);
	}
}
