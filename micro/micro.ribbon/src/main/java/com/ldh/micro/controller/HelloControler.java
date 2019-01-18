package com.ldh.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ldh.micro.service.HelloService;

/**
 * 
 * @author Li Dehuan
 * @date 2019年1月18日
 *
 */
@RestController
public class HelloControler {

	@Autowired
    HelloService helloService;
	
	@GetMapping(value = "/ribbon-consumer")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name ) + ">>ribbon";
    }
}
