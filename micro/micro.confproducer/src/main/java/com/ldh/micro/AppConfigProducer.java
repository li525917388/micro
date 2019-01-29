package com.ldh.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 配置集群
 * @author Li Dehuan
 * @date 2019年1月29日
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class AppConfigProducer {
	
    public static void main( String[] args ) {
    	
    	SpringApplication.run(AppConfigProducer.class, args);
    }
}
