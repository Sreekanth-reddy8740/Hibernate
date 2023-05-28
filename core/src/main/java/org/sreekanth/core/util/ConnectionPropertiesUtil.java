package org.sreekanth.core.util;

import java.util.Properties;

public class ConnectionPropertiesUtil {

	public static Properties getMysqlDbProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/config_db");
		properties.setProperty("hibernate.connection.username","root");
		properties.setProperty("hibernate.connection.password","password");
		properties.setProperty("hibernate.show_sql", "true");//it is used to show the sql query what is the execute
//		Hibernate : insert into user_details (city, contact_number, counrty, email, name, password, pin_code, alt_key) 
//		values (?, ?, ?, ?, ?, ?, ?, ?);
		
		properties.setProperty("hibernate.hbm2ddl.auto","update");//create table automatic - not used in realtime.
		return properties;
		
	}
}
