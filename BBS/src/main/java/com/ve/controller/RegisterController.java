package com.ve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ve.entity.User;
import com.ve.mapper.UserMapper;

/**
 * 用户注册
 * 1)返回注册页面;2)检查用户名和用户账号是否被使用;3)保存用户注册信息进数据库
 * 
 * @author thinkpad_ljj
 *
 */
@Controller
public class RegisterController {

	@Autowired
	UserMapper userMapper;

	/**
	 * 
	 * @return 注册页面
	 */
	@GetMapping("/register")
	public String register() {
		return "html/register";
	}

	/**
	 * 检查注册用户名称是否重复,从数据中查找是否存在相同的名称
	 * 
	 * @param uname 用户名
	 * @return 名称重复返回true
	 */
	@ResponseBody
	@GetMapping("/checkUserName")
	public boolean checkUserName(@RequestParam(name = "uname", required = false) String uname) {
		if (userMapper.findUserName(uname) != null) {
			return true;
		}
		return false;
	}

	/**
	 * 检查用户账号是否重复
	 * 
	 * @param uid 用户账号
	 * @return 重复则返回true
	 */
	@ResponseBody
	@GetMapping("/checkUserAcc")
	public boolean checkUserAcc(@RequestParam(name = "uid", required = false) String uid) {
		if (userMapper.findUserAcc(uid) != null) {
			return true;
		}
		return false;
	}

	/**
	 * 保存注册用户
	 * 
	 * @param user 用户信息
	 * @return 反馈注册成功信息
	 */
	@PostMapping("/register/save")
	public String saveUser(User user) {
		userMapper.save(user);
		return "html/login";
	}
}
