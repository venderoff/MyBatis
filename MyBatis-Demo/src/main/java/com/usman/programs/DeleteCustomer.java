package com.usman.programs;

import java.io.IOException;

import com.usman.dao.CustomerDao;
import com.usman.dao.DaoFactory;
import com.usman.entity.Customer;

public class DeleteCustomer {

	public static void main(String[] args) throws IOException {
		
		Integer id = 43 ;
		CustomerDao dao = DaoFactory.getCustomerDao() ;
		
	Customer c1 = 	dao.getCustomerById(id) ;
		
		if(c1 != null) {
			
		System.out.println("Customer present at ID" + id) ;
		
			dao.deleteCustomer(id);
			
			System.out.println("Successfully Deleted");
		}
		
		else {
			System.out.println("User not available") ;
		}
		

	}

}
