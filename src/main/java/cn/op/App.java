package cn.op;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @author 杨雄星 E-mail:yangxx1997@foxmail.com
* @version 创建时间：2018年11月30日 下午1:11:01
*/

@SpringBootApplication
@MapperScan("cn.op.mapper") 
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
