package com.zslalala.simple.mapper;

import java.util.List;

import com.zslalala.simple.model.User;

public interface UserMapper {
	/***
	 * 通过id查询用户
	 */
	public User selectById(Long id);
	/***
	 * 获取表中所有信息
	 */
	public List<User> selectAll();
}
