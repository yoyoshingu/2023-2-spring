package com.sg.leo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sg.leo.domain.RoleType;
import com.sg.leo.domain.User;
import com.sg.leo.repository.UserRepository;


@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user")
	public @ResponseBody String insertUser(@RequestBody User user) {
		user.setRole(RoleType.USER);
		userRepository.save(user);
		return user.getUsername() + "님 회원가입 성공";
	}
	
	@GetMapping("/user/get/{id}")
	public @ResponseBody User getUser(@PathVariable int id) {
		User findUser = userRepository.findById(id).get();
		return findUser;
	}

	@GetMapping("/user/list")
	public @ResponseBody List<User> getuserList(){
		return userRepository.findAll();
	}
	
	@DeleteMapping("/user/{id}")
	public @ResponseBody String deleteUser(@PathVariable int id) {
		userRepository.deleteById(id);
		return id + "번 회원님 삭제 성공";
	}
	
	@PutMapping("/user")
	public @ResponseBody String updateUser(@RequestBody User user) {
		User findUser = userRepository.findById(user.getId()).orElseThrow();;
		findUser.setUsername(user.getUsername());
		findUser.setPassword(user.getPassword());
		findUser.setEmail(user.getEmail());
		userRepository.save(findUser);
		return "회원정보수정완료";
	}
	
	@GetMapping("/auth/insertUser")
	public String insertUser() {
		return "user/insertUser";
	}
	
}
