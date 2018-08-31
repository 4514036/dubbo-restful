package dubbo.opt.serviceApi;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.json.JsonUtil;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import dubbo.api.model.HelloVo;
import dubbo.api.service.HelloServiceApi;


@Service("helloServiceApi")
public class HelloServiceApiImp implements HelloServiceApi{

	@Override
	public HelloVo hello(HelloVo value) {
		Map map=new HashMap<>();
		map.put("status", 200);
		map.put("data", "hello "+JSON.toJSONString(value));
		map.put("msg", "成功");
		Response resp=Response.ok(map).build();
				
		return value;
	}

}
