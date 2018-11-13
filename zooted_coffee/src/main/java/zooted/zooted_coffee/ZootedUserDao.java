package zooted.zooted_coffee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ZootedUserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
public List <ZootedUser> findAllUsers(){
		
		return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(ZootedUser.class));
	}

}
