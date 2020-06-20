package com.hibernate.curd.HibernetCURD;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CreateStudent {
	Scanner scn=new Scanner(System.in);

	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	Student student = new Student();
	public void insertData() {
		try {
		System.out.println("Enter Student id");
		int sno=scn.nextInt();scn.nextLine();
		
		System.out.println("Enter Student name");
		String sname=scn.nextLine();
		
		System.out.println("Enter Student course");
		String scourse=scn.nextLine();
		
		System.out.println("Enter Student fee");
		float sfee=scn.nextInt();scn.nextLine();
		
		
		
		student.setStudentid(sno);
		student.setStudentName(sname);
		student.setStudentCourse(scourse);
		student.setStudentFee(sfee);
		session.save(student);
		}
		catch(Exception e) {
			System.out.println("Please enter actual type value");
		}
		finally {
		t.commit();
		factory.close();
		}
	}

}

