package cn.op.mapper;

import java.util.List;

import cn.op.pojo.Users;

/**
* @author 杨雄星 E-mail:yangxx1997@foxmail.com
* @version 创建时间：2018年11月30日 上午10:50:39
*/
public interface UsersMapper {
	
	void insertUser(Users users);
	
	List<Users> selectUsersAll();
	
	String findUser(String name);
}
