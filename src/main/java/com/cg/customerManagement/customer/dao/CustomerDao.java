package com.cg.customerManagement.customer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.customerManagement.customer.entity.Customer;



@Repository
public class CustomerDao implements ICustomerDao{
	
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public Customer add(Customer customer) {
		em.persist(customer);
		return customer;
	}

	@Override
	public Customer findByID(long customerID) {
		Customer customer=em.find(Customer.class,customerID);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	

}