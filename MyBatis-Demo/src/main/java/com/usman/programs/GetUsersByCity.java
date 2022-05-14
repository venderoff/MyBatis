package com.usman.programs;

import java.io.IOException;
import java.util.List;

import com.usman.dao.CustomerDao;
import com.usman.dao.DaoFactory;
import com.usman.entity.Customer;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class GetUsersByCity {

	
	/**
	 *  retrieving user by City
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		CustomerDao dao = DaoFactory.getCustomerDao() ;
		
		String city = 		"Kanpur" ;
		
		List<Customer> elist = dao.getCustomersByCity(city) ;
		
		// This is from Stream
		elist.stream().forEach(System.out::println);
		//Stream has ended
		
		// This is from Loop
		for(Customer c : elist) {
			
			System.out.println(c) ;
		}
		
//		dao.CreateIntermediate();
		System.out.println("intermediate Created") ;
		
		

}
}