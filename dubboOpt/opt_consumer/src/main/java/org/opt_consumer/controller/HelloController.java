package org.opt_consumer.controller;

import org.opt_consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dubbo.api.model.HelloVo;

@RestController
@RequestMapping("hello")
public class HelloController {
	@Autowired
	private HelloService helloService;
	@RequestMapping("/test.do")
	public HelloVo hello() {
		return helloService.test();
	}
}
