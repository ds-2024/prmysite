package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//로그인
	@RequestMapping(value="/user/login", method = {RequestMethod.GET, RequestMethod.POST})
	public String login(@ModelAttribute UserVo userVo) {//(id, pw) vo 로 묶기
		System.out.println("UserController.login()");
		
		System.out.println(userVo);
		
		userService.exeLogin(userVo);//vo(no name) 받는다
		
		return "";  //(id, pw) vo 로 묶기 -> service 에게 보낸다 연결해야함 -> vo(no name) 받는다 -> 세션에 저장
					//성공하면 메인으로 리다이렉트
	}
	
	//로그인폼
	@RequestMapping(value="/user/loginform", method = {RequestMethod.GET, RequestMethod.POST})
	public String loginForm() {
		System.out.println("UserController.loginForm()");
		
		return "user/loginForm";
	}
	

}
