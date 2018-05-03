package com.city.blog.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.city.blog.factory.HibernateFactory;
import com.city.blog.model.LevelModel;
import com.city.blog.model.MemberModel;
import com.city.blog.service.IMemberService;

public class MemberServiceImpl implements IMemberService{

	@Override
	public void add(String id, String password, String name, int levelNo) throws Exception {
		// TODO Auto-generated method stub
		MemberModel memberModel = new MemberModel();
		memberModel.setMid(id);
		memberModel.setMname(name);
		memberModel.setMpass(password);
		LevelModel levelModel = new LevelModel();
		levelModel.setLno(levelNo);
		memberModel.setLevelModel(levelModel);
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(memberModel);
		tx.commit();
		session.close();
		System.out.println("添加成功");
	}

	@Override
	public void delete(String MemberId) throws Exception {
		// TODO Auto-generated method stub
		MemberModel memberModel = new MemberModel();
		memberModel.setMid(MemberId);
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(memberModel);
		tx.commit();
		session.close();
		System.out.println("删除成功");
	}

	@Override
	public void changePassword(String id, String password) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		MemberModel memberModel = session.get(MemberModel.class,id);
		memberModel.setMpass(password);
		Transaction tx = session.beginTransaction();
		session.update(memberModel);
		tx.commit();
		session.close();
		System.out.println("密码修改成功");
	}

	@Override
	public void changeLevel(String id, int deptNo) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		MemberModel memberModel = session.get(MemberModel.class,id);
		LevelModel levelModel = new LevelModel();
		levelModel.setLno(deptNo);
		memberModel.setLevelModel(levelModel);
		Transaction tx = session.beginTransaction();
		session.update(memberModel);
		tx.commit();
		session.close();
		System.out.println("级别修改成功");
	}

	@Override
	public boolean validate(String id, String password) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		MemberModel memberModel =  session.get(MemberModel.class, id);
		tx.commit();
		session.close();
		System.out.println("密码是："+memberModel.getMpass());
		if(password.equals(memberModel.getMpass()))
			return true;
		return false;
	}

	@Override
	public boolean hasMemberInLevel(int levelNo, String id) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		MemberModel memberModel = session.get(MemberModel.class, id);
		tx.commit();
		session.close();
		if(memberModel.getLevelModel().getLno() == levelNo)
			return true;
		return false;
	}

	@Override
	public void activeMember(String id) throws Exception {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		MemberModel memberModel = session.get(MemberModel.class,id);
		memberModel.setMstatus("Y");
		Transaction tx = session.beginTransaction();
		session.update(memberModel);
		tx.commit();
		session.close();
		System.out.println("激活成功");
	}

}
