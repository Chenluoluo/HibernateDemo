package com.city.erp.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.erp.factory.HibernateFactory;
import com.city.erp.model.OrderModel;
import com.city.erp.service.IOrderService;

public class OrderServiceImpl implements IOrderService{

	@Override
	public void add(OrderModel ov) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(ov);
		tx.commit();
		session.close();
	}

	@Override
	public void delete(OrderModel ov) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(ov);
		tx.commit();
		session.close();
	}

}
