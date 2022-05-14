package com.usman.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//Creating instance for mybatis

public final class DaoFactory {
	
	
	private DaoFactory()  {
	}
	
	public static CustomerDao getCustomerDao () throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml") ;
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is) ;
		
		//setting true will comit
		SqlSession session = factory.openSession(true) ; 
		
		return session.getMapper(CustomerDao.class) ;
		
	}

}
