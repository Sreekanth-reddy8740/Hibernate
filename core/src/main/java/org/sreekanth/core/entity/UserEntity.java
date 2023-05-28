package org.sreekanth.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_details")
public class UserEntity implements Serializable{

	@Id
	@GenericGenerator(name = "auto_genarator",strategy = "increment")
	@GeneratedValue(generator = "auto_genarator")
	@Column(name = "alt_key")
	private long altKey;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "contact_number")
	private String contactNumber;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "counrty")
	private String country;
	
	@Column(name = "pin_code")
	private String pinCode;
	
	

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "UserEntity [altKey=" + altKey + ", name=" + name + ", email=" + email + ", contactNumber="
				+ contactNumber + ", password=" + password + ", city=" + city + ", country=" + country + ", pinCode="
				+ pinCode + "]";
	}

	
	

	
}
