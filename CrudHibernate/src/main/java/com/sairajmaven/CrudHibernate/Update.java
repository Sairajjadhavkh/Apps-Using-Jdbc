package com.sairajmaven.CrudHibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.SessionUtils;

public class Update {

	public static void main(String[] args) {
		
		Session session=SessionUtils.getFactory().openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee emp=session.get(Employee.class, 4);
		Address ad=emp.getAddress();
		ad.setSector("8");
		
		session.update(emp);
		
		tx.commit();
		
		session.close();
		
	}

}
