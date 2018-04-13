package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;

		static{
			Configuration config =new Configuration();
			sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
			
		}
		public static SessionFactory getSessionFactory()
		{
			return sessionFactory;
		}
		public static Session getCurrentSession()
		{
			return sessionFactory.getCurrentSession();
		}
		public static Session openSession()
		{
			return sessionFactory.openSession();
		}
}
