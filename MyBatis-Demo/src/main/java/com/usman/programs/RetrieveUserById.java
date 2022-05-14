package com.usman.programs;

import java.io.IOException;

import com.usman.dao.CustomerDao;
import com.usman.dao.DaoFactory;
import com.usman.entity.Customer;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RetrieveUserById {

	
	/**
	 *  retrieving user by id
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		CustomerDao dao = DaoFactory.getCustomerDao() ;
		
		Customer c1 = dao.getCustomerById(35) ;
		
		if(c1==null) {
			
			System.out.println("\"No Customer for Data\"");
			log.info("No Customer for Data") ;
		}
			else {
				log.info("Customer Data Found" + c1) ;
				
				System.out.println("Customer Data Found" + c1);
		}
		
		
	}

}
