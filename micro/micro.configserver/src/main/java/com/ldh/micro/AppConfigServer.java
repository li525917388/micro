package com.ldh.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心server
 * @author Li Dehuan
 * @date 2019年1月21日
 *
 */
@EnableConfigServer
@SpringBootApplication
public class AppConfigServer {
    
	public static void main(String[] args) {
		System.out.println("正在启动配置中心...");
		SpringApplication.run(AppConfigServer.class, args);
	}
}
