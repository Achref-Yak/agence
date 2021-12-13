package filtre;

import com.netflix.zuul.ZuulFilter;

public class PostFiltre extends ZuulFilter {
	
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "post";
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
		System.out.println("Inside Responce Filtre") ;
		return null ;
	}
	

}
