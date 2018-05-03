package com.city.mis.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.city.mis.factory.HibernateFactory;
import com.city.mis.model.ClassModel;
import com.city.mis.service.IClassService;

public class ClassServiceImpl implements IClassService{

	@Override
	public List<ClassModel> getListByAll() throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String sql = "from ClassModel";
		Query<ClassModel> query = session.createQuery(sql,ClassModel.class);
		List<ClassModel> list = query.getResultList();
		tx.commit();
		session.close();
		return list;
	}

}
