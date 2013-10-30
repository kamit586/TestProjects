package com.sunrays.hibernate.tpsc.discriminator;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class PersonService {
	private static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();

	public void add(PersonDTO personDTO) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(personDTO);
		transaction.commit();
		session.close();
	}

	public void update(PersonDTO personDTO) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(personDTO);
		transaction.commit();
		session.close();
	}

	public void delete(PersonDTO personDTO) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(personDTO);
		transaction.commit();
		session.close();
	}

	public PersonDTO get(Long id) {
		Session session = sessionFactory.openSession();
		PersonDTO personDTO = (PersonDTO) session.get(PersonDTO.class, id);
		session.close();
		return personDTO;
	}

	public List getList() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from PersonDTO");
		List userList = query.list();
		session.close();
		return userList;
	}

	public List search(PersonDTO personDTO) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PersonDTO.class);

		if (personDTO.getId() != null) {
			criteria.add(Restrictions.eq("id", personDTO.getId()));
		}
		if (personDTO.getFirstName() != null) {
			criteria.add(Restrictions.like("firstName",
					personDTO.getFirstName() + "%"));
		}
		if (personDTO.getLastName() != null) {
			criteria.add(Restrictions.like("lastName", personDTO.getLastName()
					+ "%"));
		}
		if (personDTO.getDegree() != null) {
			criteria.add(Restrictions.like("degree", personDTO.getDegree()
					+ "%"));
		}

		List personList = criteria.list();
		session.close();
		return personList;
	}
}