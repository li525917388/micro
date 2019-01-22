package org.micro.configclienk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Li Dehuan
 * @date 2019年1月22日
 *
 */
@SpringBootApplication
@RestController
public class AppConfigClient {
	
	@Value("${test}")
	String test;
	@RequestMapping(value = "/client")
	public String hi(){
		return test;
	}
	
    public static void main( String[] args ) {
    	SpringApplication.run(AppConfigClient.class, args);
    }
}
