package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Geek;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class GeekDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public GeekDao() {
		super();
	}
	
	@Transactional
	public List<Geek> findAll() {
		String jpql = "select geek from Geek geek order by geek.pseudo";
		return em.createQuery(jpql, Geek.class).getResultList();
	}
	
	@Transactional
	public void persist(Geek spectacle) {
		em.persist(spectacle);
	}
	
		
	
}
