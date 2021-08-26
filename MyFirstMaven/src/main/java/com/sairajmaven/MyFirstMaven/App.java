package com.sairajmaven.MyFirstMaven;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config=new Configuration();
        config.configure();
        
        SessionFactory factory=config.buildSessionFactory();
        Session session=factory.openSession();
        
        Transaction tx=session.beginTransaction();
        Employee emp=new Employee(1,"sairaj",20000,true,LocalDate.of(2020, 8, 11));

        session.save(emp);
        
        tx.commit();
        
        session.close();
 
        
    }
}
