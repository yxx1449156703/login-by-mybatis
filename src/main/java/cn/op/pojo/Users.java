package cn.op.pojo;
/**
* @author 杨雄星 E-mail:yangxx1997@foxmail.com
* @version 创建时间：2018年11月30日 上午10:45:54
*/
public class Users {

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private Integer id;
	private String name;
	private String password;
	
}
