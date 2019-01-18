package com.ldh.micro.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Li Dehuan
 * @date 2019年1月15日
 *
 */
@RestController
public class OrderController {
	
	@Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String ip;
	
    @GetMapping("/client")
	public String test(){
		String services = "Services: " + discoveryClient.getServices()+" ip :"+ip;
        
        System.out.println(services);
        return services;
	}
}
