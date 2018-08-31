package dubbo.opt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class HelloController {

	@RequestMapping("/hello.do")
	public String test() {
		return "hello!";
	}
}
