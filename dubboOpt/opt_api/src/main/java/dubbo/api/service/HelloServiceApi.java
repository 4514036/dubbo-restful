package dubbo.api.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dubbo.api.model.HelloVo;




/**
 * Hello world!
 *
 */
@Path("rest")
public interface HelloServiceApi 
{
	   @Path("hello")
	   @POST
	   @Consumes({MediaType.APPLICATION_JSON})
	   @Produces({MediaType.APPLICATION_JSON})
	   public HelloVo hello(HelloVo vo);
}
