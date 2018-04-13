package com.Assignment1;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
		
		 
		 save();
		// delete();
		 update();
		// read();
		 	 
	}
	
	private static void read() {
		
		
	}

	private static void update() {
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		Employee empObj =  new Employee();
		 empObj.setEmployeeID(391763);
		 empObj.setEmployeeBand("B1");
		 empObj.setEmployeeName("pardha saradhi");
		 session.update(empObj);
		 tx.commit();
		
	}

	private static void delete() {
		
		
	}

	public static void save( ){
		 Session session = HibernateUtil.openSession();
		session.beginTransaction();
		 Employee empObj = new Employee();
		 empObj.setEmployeeID(391767);
		 empObj.setEmployeeBand("B2");
		 empObj.setEmployeeName("Tama Ravi Kumar");
		 session.save(empObj);
		 session.getTransaction().commit();
		 
		 Employee empObj1 = new Employee();
		 session.beginTransaction();
		 empObj1.setEmployeeID(391764);
		 empObj1.setEmployeeBand("B1");
		 empObj1.setEmployeeName("santhosh");
		 session.save(empObj1);
		 session.getTransaction().commit();
	
	}
}
