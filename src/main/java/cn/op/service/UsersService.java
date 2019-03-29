package cn.op.service;

import java.util.List;

import cn.op.pojo.Users;

/**
* @author 杨雄星 E-mail:yangxx1997@foxmail.com
* @version 创建时间：2018年11月30日 上午11:03:38
*/
public interface UsersService {
	
	void addUser(Users users);
	
	List<Users> findUserAll();
	
	String findUser(String name);
}
