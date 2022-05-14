package com.usman.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.usman.entity.Customer;

public interface CustomerDao {

	//CRUD Operations
	@Insert("insert into customers (name,city,email,phone) values( #{name}, #{city},#{email},#{phone})")
	@Options(useGeneratedKeys = true, keyProperty = "id")		       
	public void addCustomer(Customer customer) ;
	
	@Insert("insert into intermediate select * from customers")
	public void CreateIntermediate() ;
	
	@Select("select * from customers where id= #{id} ")
	public Customer getCustomerById(Integer i) ;
	
	@Update("update customers set name=#{name} , city=#{city} , phone=#{phone} where id=#{id}")
	public void updateCustomer(Customer customer) ;
	
	@Delete("delete from customers where id=#{id}")
	public void deleteCustomer(Integer id) ;
	
	//Queries
	
	@Select("select * from customers")
	public List<Customer> getAllCustomer() ;
	
	@Select( " select * from customers where city = #{city}")
	public List<Customer> getCustomersByCity(String city) ;
	
}
