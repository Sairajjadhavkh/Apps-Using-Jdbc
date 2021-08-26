package com.sairajmaven.CrudHibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.SessionUtils;

public class Delete {

	public static void main(String[] args) {
		
		
		Session session=SessionUtils.getFactory().openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee emp=session.get(Employee.class, 3);
		session.delete(emp);
		
		tx.commit();
		
		session.close();
	}

}
