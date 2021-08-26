package com.sairajmaven.CrudHibernate;

import org.hibernate.Session;

import com.util.SessionUtils;

public class Insert 
{
    public static void main( String[] args )
    {
        Session session=SessionUtils.getFactory().openSession();
        Address ad=new Address("mh","16","sasas");
        Employee emp=new Employee("sairaj","mumbai");
        emp.setAddress(ad);
        session.save(emp);   
        session.close();
        
    }
}
