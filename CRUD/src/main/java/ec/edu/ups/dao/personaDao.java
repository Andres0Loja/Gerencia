package ec.edu.ups.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.modelo.persona;


@Stateless
public class personaDao {
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;

	public boolean insertJPA(persona entity) throws SQLException {
		em.persist(entity);
		return true;
	}
	public persona read(String cedula) throws Exception {
        try {
            return em.find(persona.class, cedula);
        } catch (Exception e) {
            throw new Exception("Erro leer Cliente " +e.getMessage());
        }
    }
}
