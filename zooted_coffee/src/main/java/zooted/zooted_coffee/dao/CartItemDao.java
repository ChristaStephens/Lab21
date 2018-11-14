package zooted.zooted_coffee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import zooted.zooted_coffee.bean.CartItem;

@Repository
@Transactional
public class CartItemDao {
	
	@PersistenceContext
	protected EntityManager em;
	
	//we want to find all the items in the cart
	public List <CartItem> findAll() {
		
		//listing all the items in the cart from the SQL
		return em.createQuery(" FROM CartItem", CartItem.class).getResultList();
		
	}
	
	//CartItem is the name of the JavaBean class/Entity represents objects in the database
	public CartItem findById(Long id) {
		return em.find(CartItem.class, id);
	}
	


}
