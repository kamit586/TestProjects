package com.sunrays.hibernate.merge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentService {

	private static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();

	public static void main(String[] args) {
		Session session1 = sessionFactory.openSession();
		Transaction transaction = session1.beginTransaction();
		StudentDTO student1 = (StudentDTO) session1.get(StudentDTO.class, 1);
		transaction.commit();
		session1.close();

		student1.setJsp(100);

		Session session2 = sessionFactory.openSession();
		transaction = session2.beginTransaction();
		StudentDTO student2 = (StudentDTO) session2.get(StudentDTO.class, 1);
		// session2.update(student1);// An exception occurred.
		session2.merge(student1);
		transaction.commit();
		session2.close();

	}

	public static void add() {
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName("Rahul");
		studentDTO.setJava(100);
		studentDTO.setJsp(100);
		studentDTO.setServlet(100);

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(studentDTO);
		transaction.commit();
		session.close();
	}
}