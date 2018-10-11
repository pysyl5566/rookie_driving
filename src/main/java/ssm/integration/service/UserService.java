package ssm.integration.service;

import ssm.integration.entity.User;

public interface UserService {

	public void add(User user);
	
	public void update(User user);
	
	public User selectById(long id);
	
	public long deleteById(long id);
}
