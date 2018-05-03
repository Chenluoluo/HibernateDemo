package com.city.oa.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.oa.factory.HibernateFactory;
import com.city.oa.model.EmployeeModel;
import com.city.oa.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public void add(EmployeeModel em) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(em);
		tx.commit();
		session.close();
	}

}
