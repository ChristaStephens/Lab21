package zooted.zooted_coffee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import zooted.zooted_coffee.bean.ZootedUser;

@Repository
@Transactional
public class ZootedUserDao {

	@PersistenceContext
	protected EntityManager em;

	public List<ZootedUser> findAllUsers() {
		// we want to find all the items in the SQL
		// (after "from" we are use the class info, type exactly)
		return em.createQuery("FROM ZootedUser", ZootedUser.class).getResultList();
	}

	public ZootedUser findById(Long id) {
		return em.find(ZootedUser.class, id);
	}

	public void deleteById(Long id) {

		em.createQuery("DELETE FROM ZootedUser WHERE id =" + id);
	}

	public List<ZootedUser> findByCategory(String last) {
		// HQL queries can have named parameters, such as :regex here.
		// HQL queries use Java class and property names, not SQL table & column names.
		return em.createQuery("FROM ZootedUser WHERE last = :last", ZootedUser.class).setParameter("last", last)
				.getResultList();
	}

	public void create(ZootedUser zootedUser) {
		em.persist(zootedUser);
	}

	public void update(ZootedUser zootedUser) {
		em.merge(zootedUser);
	}
	
	//we have the class turning into the variable(that's why it's listed twice in the () )
	public void delete(ZootedUser zootedUser) {
		em.remove(zootedUser);
	}

}
