package com.sap.erp.inventory.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sap.erp.inventory.factory.HibernateFactory;
import com.sap.erp.inventory.model.ProductModel;
import com.sap.erp.inventory.service.IProductService;

public class ProductServiceImpl implements IProductService {

	@Override
	public void add(ProductModel pm) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(pm);
		tx.commit();
		session.close();
	}

}
