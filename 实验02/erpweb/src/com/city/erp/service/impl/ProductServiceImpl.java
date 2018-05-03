package com.city.erp.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.city.erp.model.ProductModel;
import com.city.erp.service.IProductService;

public class ProductServiceImpl implements IProductService{

	@Override
	public void add(ProductModel cm) throws Exception {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(cm);
		tx.commit();
		session.close();
		sf.close();
	}

	@Override
	public void modify(ProductModel cm) throws Exception {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.update(cm);
		tx.commit();
		session.close();
		sf.close();
	}

}
