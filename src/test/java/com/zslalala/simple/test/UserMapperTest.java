package com.zslalala.simple.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.zslalala.simple.mapper.UserMapper;
import com.zslalala.simple.model.User;

import junit.framework.Assert;

public class UserMapperTest extends BaseMapperTest{

	@Test
	public void testSelectById() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.selectById(1L);
			//User不为空
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectAll()
	{
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<User> userList = userMapper.selectAll();
			System.out.println(userList);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
}
