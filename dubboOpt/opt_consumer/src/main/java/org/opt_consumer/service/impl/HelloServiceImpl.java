package org.opt_consumer.service.impl;

import org.opt_consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dubbo.api.model.HelloVo;
import dubbo.api.service.HelloServiceApi;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloServiceApi helloServiceApi;
	@Override
	public HelloVo test() {
		HelloVo vo=new HelloVo();
		vo.setValue("test");
		return helloServiceApi.hello(vo);
	}

}
