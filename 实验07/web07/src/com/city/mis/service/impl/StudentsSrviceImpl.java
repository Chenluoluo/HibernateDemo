package com.city.mis.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.mis.factory.HibernateFactory;
import com.city.mis.model.StudentModel;
import com.city.mis.service.IStudentService;

public class StudentsSrviceImpl implements IStudentService{

	@Override
	public void add(StudentModel sm) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(sm);
		tx.commit();
		session.close();
	}

}
