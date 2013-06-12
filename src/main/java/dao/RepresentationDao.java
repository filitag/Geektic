package dao;

import javax.persistence.EntityManager;

public class RepresentationDao {
	private EntityManager em;

	public RepresentationDao(EntityManager em) {
		this.em = em;
	}
	
}
