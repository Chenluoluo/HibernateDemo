package com.city.oa.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {
	private static SessionFactory sf = null;

	public static SessionFactory createSessionFactory() {
		if (sf == null) {
			Configuration cfg = new Configuration();
			cfg.configure();
			sf = cfg.buildSessionFactory();
		}
		return sf;
	}
}
