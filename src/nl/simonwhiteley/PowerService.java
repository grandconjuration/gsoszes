package nl.simonwhiteley;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class PowerService {
	
	private int actualResult;
	
	@WebMethod
	public int PowerRequest(int x, int power) {
		actualResult = x * power;
		return actualResult;
	}

}
