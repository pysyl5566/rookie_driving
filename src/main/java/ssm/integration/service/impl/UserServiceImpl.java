package ssm.integration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ssm.integration.dao.UserDao;
import ssm.integration.entity.User;
import ssm.integration.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	@Transactional
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User selectById(long id) {
		return userDao.selectById(id);
	}

	@Override
	@Transactional
	public long deleteById(long id) {
		return userDao.deleteById(id);
	}

}
