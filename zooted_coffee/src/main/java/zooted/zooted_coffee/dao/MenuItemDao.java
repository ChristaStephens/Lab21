package zooted.zooted_coffee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import zooted.zooted_coffee.bean.MenuItem;

@Repository
@Transactional
public class MenuItemDao {
	
	@PersistenceContext
	protected EntityManager em;
	
	//we want to find all the items in the menu
	public List <MenuItem> findAll() {
		
		//we want to find all the items in the SQL
		return em.createQuery(" FROM MenuItem", MenuItem.class).getResultList();
		
	}
	
	public MenuItem findById(Long id) {
		return em.find(MenuItem.class, id);
	}
	
	
	
	public List<MenuItem> findByCategory(String category) {
		// HQL queries can have named parameters, such as :regex here.
		// HQL queries use Java class and property names, not SQL table & column names.
		return em.createQuery("FROM Food WHERE category = :category", MenuItem.class)
				.setParameter("category", category)
				.getResultList();
	}
	
	public List<MenuItem> findByKeyword(String keyword) {
		return em.createQuery("FROM MenuItem WHERE LOWER(name) LIKE :regex", MenuItem.class)
				.setParameter("regex", "%" + keyword.toLowerCase() + "%")
				.getResultList();
	}
	public void create(MenuItem menuItem) {
		em.persist(menuItem);
	}
	
	public void update(MenuItem menuItem) {
		em.merge(menuItem);
	}

	public void delete (MenuItem menuItem) {
		em.remove(menuItem);
	}
}
