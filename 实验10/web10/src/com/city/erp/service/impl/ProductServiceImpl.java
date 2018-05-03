package com.city.erp.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.city.erp.factory.HibernateFactory;
import com.city.erp.model.ProductModel;
import com.city.erp.service.IProductService;

public class ProductServiceImpl implements IProductService {

	@Override
	public List<ProductModel> getListByPriceWithPage(double low, double high, int rows, int page) throws Exception {
		// TODO Auto-generated method stub
		String hql = "from ProductModel pm where pm.unitprice between :min and :max";
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Query<ProductModel> query = session.createQuery(hql,ProductModel.class);
		query.setParameter("min", low);
		query.setParameter("max", high);
		query.setMaxResults(rows);
		query.setFirstResult(rows*(page-1));
		List<ProductModel> list = query.getResultList();
//		for (ProductModel productModel : list) {
//			System.out.println(productModel.getProductid());
//		}
		session.close();
		return list;
	}

	@Override
	public int getCountByPrice(double low, double high) throws Exception {
		String hql = "select count(pm) from ProductModel pm where pm.unitprice between :min and :max";
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Query<Long> query = session.createQuery(hql,Long.class);
		query.setParameter("min", low);
		query.setParameter("max", high);
		int count = query.uniqueResult().intValue();
		System.out.println(count);
		session.close();
		return count;
	}

	@Override
	public int getPageCountByPrice(double low, double high, int rows) throws Exception {
		String hql = "select count(pm) from ProductModel pm where pm.unitprice between :min and :max";
		SessionFactory sf = HibernateFactory.createSessionFactory();
		Session session = sf.openSession();
		Query<Long> query = session.createQuery(hql,Long.class);
		query.setParameter("min", low);
		query.setParameter("max", high);
		int pagecount = query.uniqueResult().intValue();
		System.out.println(pagecount/rows);
		session.close();
		return pagecount/rows;
	}

}
