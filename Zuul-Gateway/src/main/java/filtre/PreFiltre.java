package filtre;
import javax.servlet.http.HttpServletRequest;

//import org.apache.http.protocol.RequestContent;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
public class PreFiltre extends ZuulFilter {
	
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}


	public boolean shouldFilter () {
		return true ;
		
	}
	public Object run () {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request =ctx.getRequest();
		
		System.out.println("Request Method :" + request.getMethod() + "Request URL :" + request.getRequestURL().toString() ) ;
		return null ;
	}

}
