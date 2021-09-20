package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Student student = new Student();

		student.setStudentId(11);
		student.setDept("hr");
		student.setName("divyaa kashyap");
		
		session.persist(student);
		System.out.println("inserted");

		tx.commit();

		session.close();
	}

}
