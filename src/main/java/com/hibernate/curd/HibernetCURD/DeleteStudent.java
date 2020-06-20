package com.hibernate.curd.HibernetCURD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DeleteStudent {
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
public void deletebyid() {
		
		System.out.println("DELETE ID 6");
		session.createQuery("DELETE FROM Student WHERE id=5 ").executeUpdate();
		//session.getTransaction();
		t.commit();
		System.out.println("Done");
	}

}
