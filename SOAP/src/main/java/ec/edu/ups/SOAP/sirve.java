package ec.edu.ups.SOAP;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class sirve {

	@WebMethod
	public double Suma(double a, double b) {
		double sum=a+b;
		return sum;
	}
	@WebMethod
	public double Resta(double a, double b) {
		double res=a-b;
		return res;
	}
	@WebMethod
	public double multiplicacion(double a, double b) {
		double mul=a*b;
		return mul;
	}
	@WebMethod
	public double divicion(double a, double b) {
		double div=a/b;
		return div;
	}
}
