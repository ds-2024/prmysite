package com.javaex.dao;

import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository /* 데이터 액세스 예외를 처리하기 위한 용도 */
public class UserDao {
	
	public void userSelectByIdPw(UserVo userVo) {
		System.out.println("UserDao.userSelectByIdPw()");
		
		System.out.println(userVo);
		
	}

}
