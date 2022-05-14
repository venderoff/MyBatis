package com.usman.programs;

import java.io.IOException;

import com.usman.dao.CustomerDao;
import com.usman.dao.DaoFactory;
import com.usman.entity.Customer;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class AddNewCustomer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CustomerDao dao = DaoFactory.getCustomerDao() ;
		dao.deleteCustomer(44);
		
		System.out.println("Id 44 deleted") ;
		Customer c1 = new Customer() ;
		c1.setName("usman"); ;
		c1.setEmail("Venderoff@gmail5.com");
		c1.setPhone("965001218012345");
		c1.setCity("Kanpur");
        
		dao.addCustomer(c1);
		
		log.info("User has been added" );
		
		
	System.out.println(c1);
	}

}
