package cn.op.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import cn.op.mapper.UsersMapper;
import cn.op.pojo.Users;
import cn.op.service.UsersService;

/**
* @author 杨雄星 E-mail:yangxx1997@foxmail.com
* @version 创建时间：2018年11月30日 上午11:08:18
*/

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersMapper;
	@Override
	public void addUser(Users users) {
		this.usersMapper.insertUser(users);
	}
	@Override
	public List<Users> findUserAll(){
		return this.usersMapper.selectUsersAll();
	}
	@Override
	public String findUser(String name) {
		return this.usersMapper.findUser(name);
	}
	
}
