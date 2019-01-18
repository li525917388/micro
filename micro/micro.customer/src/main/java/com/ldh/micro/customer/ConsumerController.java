package com.ldh.micro.customer;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ldh.micro.order.service.OrderService;

/**
 * 
 * @author Li Dehuan
 * @date 2019年1月17日
 *
 */
@RestController
public class ConsumerController {

	@Resource
	OrderService orderService;
	
	@RequestMapping(value="/ribbon-consumer",method=RequestMethod.GET)
    public String helloConsumer(@RequestParam String name) {
        return orderService.test(name);
    }
}
