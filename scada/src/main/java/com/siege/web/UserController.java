package com.siege.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.siege.entity.UserEntity;
import com.siege.mapper.UserMapper;

@RestController
@RequestMapping("/userController")
public class UserController {
	@Autowired private UserMapper userMapper;

	@RequestMapping("/users")
	public List<UserEntity> getUsers() {
		List<UserEntity> users = userMapper.getAll();
		return users;
	}

	@RequestMapping("/users/{id}")
	public UserEntity getUser(@PathVariable("id") Long id) {
		UserEntity user = userMapper.getOne(id);
		return user;
	}

	@RequestMapping("/add")
	public void save(UserEntity user) {
		userMapper.insert(user);
	}

	@RequestMapping(value = "update")
	public void update(UserEntity user) {
		userMapper.update(user);
	}

	@RequestMapping(value = "/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		userMapper.delete(id);
	}

	@RequestMapping(value = "/login")
	public void login(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletResponse response) throws IOException {
		System.out.println(username);
		System.out.println(password);
		if ("atjqz".equals(username) && "000000".equals(password)||"admin".equals(username) && "000000".equals(password))
			response.sendRedirect("/html/anting.html");
		else if("yfjqz".equals(username) && "000000".equals(password))
			response.sendRedirect("/html/yunfu.html");
	}
	
	@RequestMapping(value = "/getMenu")
	public String getMenu(@RequestParam("username") String username, @RequestParam(value="password", required=false) String password) throws IOException {
		System.out.println(username);
		System.out.println(password);
		if ("admin".equals(username))
			return "[{\"id\":0,\"station\":\"安亭站\",\"dataurl\":\"anting.html\",\"reporturl\":\"report_anting.html\",\"amounturl\":\"amount_anting.html\"},"+
			       "{\"id\":1,\"station\":\"云浮站\",\"dataurl\":\"yunfu.html\", \"reporturl\":\"report_yunfu.html\",\"amounturl\":\"amount_yunfu.html\"},"+
					"{\"id\":2,\"station\":\"大连站\",\"dataurl\":\"dalian1.html\", \"reporturl\":\"report_dalian1.html\",\"amounturl\":\"dalian1_yunfu.html\"}]";
		else if("atjqz".equals(username))
			return "[{\"id\":0,\"station\":\"安亭站\",\"dataurl\":\"anting.html\",\"reporturl\":\"report_anting.html\",\"amounturl\":\"amount_anting.html\"}]";
		else if("yfjqz".equals(username))
			return "[{\"id\":1,\"station\":\"云浮站\",\"dataurl\":\"yunfu.html\", \"reporturl\":\"report_yunfu.html\",\"amounturl\":\"amount_yunfu.html\"}]";
		else if("dljqz".equals(username))
			return "[{\"id\":2,\"station\":\"大连站\",\"dataurl\":\"dalian1.html\", \"reporturl\":\"report_dalian1.html\",\"amounturl\":\"amount_dalian1.html\"}]";
		else
			return null;
	}
}