package org.sreekanth.core.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
import org.sreekanth.core.dto.UserDto;
import org.sreekanth.core.entity.UserEntity;
//import org.sreekanth.core.util.ConnectionPropertiesUtil;
import org.sreekanth.core.util.SessionFactoryUtil;

public class UserRepository {

	public void saveOrUpdate(UserEntity userEntity) {
//		Configuration cfg = new Configuration();
//		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//		cfg.addAnnotatedClass(UserEntity.class);
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		Session session = sessionFactory.openSession();//Live Connection.
//		Transaction transaction = session.beginTransaction();
//		session.save(userEntity);
//		transaction.commit();
		
		/*
		 meta data means it gives a extra piece of information it is not used by the user but internally used this 
		 information at the time of code Execution.
		*/
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();//Live Connection.
		Transaction transaction = session.beginTransaction();
		session.merge(userEntity);
		transaction.commit();
			
	}
	
	public UserEntity findById(long id) {
		/*Configuration cfg = new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(UserEntity.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		*/
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(UserEntity.class, id);
	}
	
	
	public void update(UserDto userDto) {
		
		UserEntity userEntity=findById(userDto.getAlt_key());
		if(userEntity!=null)
		{
			userEntity.setName(userDto.getName());
			userEntity.setCity(userDto.getCity());
			userEntity.setCountry(userDto.getCountry());
			userEntity.setPinCode(userDto.getPinCode());
			userEntity.setEmail(userDto.getEmail());
			saveOrUpdate(userEntity);
		/*	
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(UserEntity.class);
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();//Live Connection.
			Transaction transaction = session.beginTransaction();
			session.save(userEntity);
			transaction.commit();
		*/
		}
		
		
	}

	/*public void delete(long id) {
		UserEntity userEntity = findById(id);
		if(userEntity!=null) {
			userEntity.setName(userEntity.getName());
			userEntity.setCity(userEntity.getCity());
			userEntity.setContactNumber(userEntity.getContactNumber());
			userEntity.setCountry(userEntity.getCountry());
			userEntity.setEmail(userEntity.getEmail());
			userEntity.setPassword(userEntity.getPassword());
			userEntity.setPinCode(userEntity.getPinCode());
			SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(userEntity);
			transaction.commit();
			}
			
		}
	*/
	
	public void delete(UserEntity userEntity) {
		
		UserEntity entity = findById(userEntity.getAltKey());
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(userEntity);
		transaction.commit();
		
		
	}
}
