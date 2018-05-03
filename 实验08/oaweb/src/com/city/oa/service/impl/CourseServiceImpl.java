package com.city.oa.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.city.oa.factory.HibernateFactory;
import com.city.oa.model.CourseModel;
import com.city.oa.service.ICourseService;

public class CourseServiceImpl implements ICourseService{

	@Override
	public List<CourseModel> getListByAll() throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String sql = "from CourseModel";
		Query<CourseModel> query = session.createQuery(sql,CourseModel.class);
		List<CourseModel> list = query.getResultList();
		tx.commit();
		session.close();
		return list;
	}

}
