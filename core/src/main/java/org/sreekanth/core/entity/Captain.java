package org.sreekanth.core.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="captain_info")
public class Captain implements Serializable{

	@Id
	@GenericGenerator(name = "auto_genarator",strategy = "increment")
	@GeneratedValue(generator = "auto_genarator")
	@Column(name = "alt_key")
	private long altKey; 
	
	@Column(name="captain_name")
	private String captainName;
	
	@Column(name="age")
	private String age;
	
	@Column(name="email")
	private String email;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
