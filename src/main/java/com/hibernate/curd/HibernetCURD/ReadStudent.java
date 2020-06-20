package com.hibernate.curd.HibernetCURD;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class ReadStudent {
	/*
	 * StandardServiceRegistry ssr = new
	 * StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	 * Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	 */

	//SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Configuration config=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory =config.buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();

	public void retriveList() {
		
		List<Student> thestu = session.createQuery("from Student").list();

		for (Student stud : thestu) {
			System.out.println(stud);
		}
			
	}

	
}
