package dubbo.opt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.remoting.http.servlet.BootstrapListener;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Configuration
@ImportResource({"classpath*:application-*.xml"})
public class ProviderApp 
{
	public static void main(String[] args) {
		
		ApplicationContext act = SpringApplication.run(ProviderApp.class, args);
		
//		SpringUtil.setApplicationContext(act);

	}
	@Bean
	public ServletListenerRegistrationBean<BootstrapListener> getServletListenerRegistrationBean() {
		BootstrapListener listener=new BootstrapListener();
		ServletListenerRegistrationBean<BootstrapListener> listenerReg=new ServletListenerRegistrationBean<>();
		listenerReg.setListener(listener);
		return listenerReg;
	}
}
