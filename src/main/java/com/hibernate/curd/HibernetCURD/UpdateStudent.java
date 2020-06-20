package com.hibernate.curd.HibernetCURD;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class UpdateStudent {
	Scanner scn= new Scanner(System.in);
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build(); 

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	
	public void updatebyid() {
		/*
		 * System.out.println("Enter student id to update "); int sid =scn.nextInt();
		 */
		
	
		
		session.createQuery("update Student set studentName ='Mishra ji' where id=2  ").executeUpdate();
		System.out.println("Update LastName Student");
		t.commit();
		factory.close();
		System.out.println("Done");
		
		}
}

