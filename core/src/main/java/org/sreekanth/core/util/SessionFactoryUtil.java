package org.sreekanth.core.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sreekanth.core.entity.AirHosterss;
import org.sreekanth.core.entity.Brand;
import org.sreekanth.core.entity.Captain;
import org.sreekanth.core.entity.Flight;
import org.sreekanth.core.entity.Product;
import org.sreekanth.core.entity.Team;
import org.sreekanth.core.entity.UserEntity;

public class SessionFactoryUtil {

	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(UserEntity.class);
//			cfg.addAnnotatedClass(Team.class);
//			cfg.addAnnotatedClass(Captain.class);
//			cfg.addAnnotatedClass(AirHosterss.class);
//			cfg.addAnnotatedClass(Flight.class);
//			cfg.addAnnotatedClass(Product.class);
//			cfg.addAnnotatedClass(Brand.class);
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
	
}
