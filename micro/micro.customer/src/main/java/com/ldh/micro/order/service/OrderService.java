package com.ldh.micro.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ldh.micro.order.service.impl.OrderServiceImpl;

/**
 * 
 * @author Li Dehuan
 * @date 2019年1月18日
 *
 */
@FeignClient(value = "eureka-client",fallback = OrderServiceImpl.class)
public interface OrderService {

	/**
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/client",method = RequestMethod.GET)
	String test(@RequestParam(value = "name") String name);
}
