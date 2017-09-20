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
		if ("atjqz".equals(username) && "000000".equals(password))
			response.sendRedirect("/html/anting.html");
	}
}