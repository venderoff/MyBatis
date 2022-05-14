package com.usman.programs;

import java.io.IOException;
import java.security.Identity;
import java.util.List;

import com.usman.dao.CustomerDao;
import com.usman.dao.DaoFactory;
import com.usman.entity.Customer;

public class ListOfCustomers {

	/**
	 * getting the List of Customers
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		CustomerDao dao = DaoFactory.getCustomerDao() ;
		
		
//		Customer c1 = dao.getAllCustomer() ;
		
		List<Customer> elist = dao.getAllCustomer() ;
		
		elist.stream().forEach(System.out::println);
			
		System.out.println("Printing Id's less then 10");	
		elist.stream().filter(i -> i.getId() <10   ).forEach(System.out::println);
		
		System.out.println(elist);
		

	}

}
