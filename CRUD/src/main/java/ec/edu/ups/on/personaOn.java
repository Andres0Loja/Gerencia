package ec.edu.ups.on;

import java.sql.SQLException;

import javax.inject.Inject;

import ec.edu.ups.dao.personaDao;
import ec.edu.ups.modelo.persona;

public class personaOn {
	@Inject
	private personaDao pd;
	public String crear(persona p) {
		try {
			if(pd.read(p.getCedula())==null) {
				pd.insertJPA(p);
				return "crear";
			}else {
				return "existe";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}
}
