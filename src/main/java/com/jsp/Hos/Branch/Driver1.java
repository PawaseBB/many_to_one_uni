package com.jsp.Hos.Branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("bhushan");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital1 hospital= new Hospital1();
		hospital.setName("Emergency");
		hospital.setGst_no("HSFDYH65276");
		
		Branch1 branch1= new Branch1();
		branch1.setLocation("Vashi");
		branch1.setName("Emergency-1");
		
		Branch1 branch2= new Branch1();
		branch2.setLocation("Thane");
		branch2.setName("Emergency-2");
		
		Branch1 branch3= new Branch1();
		branch3.setLocation("Panvel");
		branch3.setName("Emergency-3");
		
		branch1.setHospital1(hospital);
		branch2.setHospital1(hospital);
		branch3.setHospital1(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
		
	}

}
