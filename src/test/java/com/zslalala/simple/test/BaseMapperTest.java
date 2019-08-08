package com.zslalala.simple.test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.util.List;

import com.zslalala.simple.model.CountryMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BaseMapperTest {

	private static SqlSessionFactory sqlSessionFactory;
	
	//在所有测试执行之前执行一次，类中只会执行一次
	@BeforeClass
	public static void init()
	{
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public SqlSession getSqlSession()
	{
		return sqlSessionFactory.openSession();
	}
}
