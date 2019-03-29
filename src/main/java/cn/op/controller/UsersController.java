package cn.op.controller;

import java.awt.Dialog.ModalExclusionType;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;

import org.apache.ibatis.annotations.Param;
import org.apache.tomcat.util.http.fileupload.ThresholdingOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.druid.sql.dialect.oracle.ast.clause.ModelClause.ModelColumn;
import java.util.List;
import cn.op.pojo.Users;
import cn.op.service.UsersService;

/**
* @author 杨雄星 E-mail:yangxx1997@foxmail.com
* @version 创建时间：2018年11月30日 上午11:12:56
*/

@Controller
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	@RequestMapping("/addUser")
	public String addUser(Users users) {
		this.usersService.addUser(users);
		return "ok";
	}
	
	@RequestMapping("/findUserAll")
	public String findUserAll(Model model){
		List<Users> list=this.usersService.findUserAll();
		model.addAttribute("list",list);
		return "showUsers";
	}
	@RequestMapping("/findUser")
	public String findUser(@RequestParam("names")String name , @RequestParam("passwords")String password) {
		String pass=this.usersService.findUser(name);
		System.out.println(pass);
		System.out.println(password);
		if(password.equals(pass)) {
			return "ok";
		}
		else {
			return "no";
		}
	}
}
