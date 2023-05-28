  package org.sreekanth.core.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.sreekanth.core.entity.Brand;
import org.sreekanth.core.entity.Flight;
import org.sreekanth.core.entity.Team;
import org.sreekanth.core.util.SessionFactoryUtil;

public class AssosiationRepository {

	public void saveTeamDetails(Team team) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(team);
		transaction.commit();
	}
	
	public void saveFlightDetails(Flight flight) {
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(flight);
		transaction.commit();
		
	}
	public void saveBrandDetails(Brand brand) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(brand);
		transaction.commit();
	}
}
