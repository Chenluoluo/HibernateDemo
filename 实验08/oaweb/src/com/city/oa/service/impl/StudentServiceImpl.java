package com.city.oa.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.city.oa.factory.HibernateFactory;
import com.city.oa.model.CourseModel;
import com.city.oa.model.StudentModel;
import com.city.oa.service.IStudentService;

public class StudentServiceImpl implements IStudentService{

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

	@Override
	public void addCourse(String id, int courseNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCourses(String id, int[] courses) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		StudentModel studentModel = session.get(StudentModel.class, id);
		for (int i : courses) {
			CourseModel courseModel = session.get(CourseModel.class, i);
			studentModel.getCourses().add(courseModel);
		}
		tx.commit();
		session.close();
	}

	@Override
	public List<CourseModel> getCoursesByStudent(String studentId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
