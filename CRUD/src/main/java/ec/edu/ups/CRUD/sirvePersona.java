package ec.edu.ups.CRUD;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.dao.personaDao;
import ec.edu.ups.modelo.persona;
import ec.edu.ups.on.personaOn;
@WebService
public class sirvePersona {
	@Inject
	private personaOn po;
	
	@WebMethod
	public String registrar(persona p) {	
			return po.crear(p);	
	}
}
