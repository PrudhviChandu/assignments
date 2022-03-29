package com.te.hibernatefirst.dml;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatefirst.Employee;

public class HibernateDelete {
	public static void main(String[] args) {
	
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		

	Employee employee=entityManager.find(Employee.class,102);
	entityManager.remove(employee);
		entityTransaction.commit();
	}
}
