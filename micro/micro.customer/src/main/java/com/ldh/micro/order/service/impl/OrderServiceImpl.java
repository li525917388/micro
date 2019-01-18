package com.ldh.micro.order.service.impl;

import org.springframework.stereotype.Component;

import com.ldh.micro.order.service.OrderService;

/**
 * 
 * @author Li Dehuan
 * @date 2019年1月18日
 *
 */
@Component
public class OrderServiceImpl implements OrderService {

	@Override
	public String test(String name) {
		// TODO Auto-generated method stub
		return "Im sorry " + name;
	}

}
