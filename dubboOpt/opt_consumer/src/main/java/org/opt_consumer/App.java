package org.opt_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@Configuration
@ImportResource({"classpath*:application-*.xml"})
public class App 
{
	public static void main(String[] args) {
		ApplicationContext act = SpringApplication.run(App.class, args);
//		SpringUtil.setApplicationContext(act);


	}
}