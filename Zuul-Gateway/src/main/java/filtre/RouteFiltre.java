package filtre;

import com.netflix.zuul.filters.ZuulServletFilter;

public class RouteFiltre extends ZuulServletFilter {
	
	public String filterType() {
		// TODO Auto-generated method stub
		return "route";
	}
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public boolean shouldFilter () {
		return true ;
		
	}
	public Object run () {
		System.out.println("Inside Route Filtre") ;
		return null ;
	}
}
