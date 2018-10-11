package ssm.integration.dao;

import ssm.integration.entity.User;

/**
 * @author James Mung
 * */
public interface UserDao {

	public void add(User user);
	
	public void update(User user);
	
	public User selectById(long id);
	
	public long deleteById(long id);
	
}
