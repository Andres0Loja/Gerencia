package ec.edu.ups.SOAP;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class sirve {
	@WebMethod
	public String Haber() {
		return "Sirve";
	}
}
