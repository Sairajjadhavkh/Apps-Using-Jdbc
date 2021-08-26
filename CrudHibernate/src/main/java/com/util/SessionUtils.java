package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtils {
	
	private static SessionFactory sessionFactory;

	private SessionUtils() {
	}
	
	public static SessionFactory getFactory() {
		if(sessionFactory==null || sessionFactory.isClosed()) {
			sessionFactory =new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}
	
	public void closeFactory() {
		if(sessionFactory!=null || sessionFactory.isOpen()) {
			sessionFactory.close();
		}
	}
	
	

}
