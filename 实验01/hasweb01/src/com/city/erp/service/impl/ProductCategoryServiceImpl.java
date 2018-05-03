package com.city.erp.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.city.erp.model.ProductCategoryModel;
import com.city.erp.service.IProductCategoryService;

public class ProductCategoryServiceImpl implements IProductCategoryService{

	@Override
	public void add(ProductCategoryModel pcm) throws Exception {
		// TODO Auto-generated method stub
//		Configuration cfg=new Configuration();
//		cfg.configure();
//		SessionFactory sf=cfg.buildSessionFactory();
//		Session session=sf.openSession();
//		Transaction tx=session.beginTransaction();
//		session.save(pcm);
//		tx.commit();
//		session.close();
//		sf.close();
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(pcm);
		tx.commit();
		session.close();
		sf.close();
	}

}
