package filtre;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter {
	public String filterType () {
		return"error" ;
		
	}

	public boolean shouldFilter () {
		return true ;
		
	}
	public Object run () {
		System.out.println("Inside Route Filtre") ;
		return null ;
	}
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	

}
