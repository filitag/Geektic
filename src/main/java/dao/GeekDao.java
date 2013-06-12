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
		String jpql = "select * from GEEK  order by pseudo";
		return em.createQuery(jpql, Geek.class).getResultList();
	}
	
	@Transactional
	public void persist(Geek spectacle) {
		em.persist(spectacle);
	}
	
	@Transactional
	public Geek findById(Long id) {
		return em.find(Geek.class, id);
	}
		
	
}
