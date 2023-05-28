package org.sreekanth.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product_info")
public class Product implements Serializable{

	@Id
	@GenericGenerator(name = "auto_genarator",strategy = "increment")
	@GeneratedValue(generator = "auto_genarator")
	@Column(name = "alt_key")
	private long altKey;
	
	@Column(name="product_name")
	private String ProductName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="product_brand")
	private List<Brand> brands;
	
	public Product() {
		super();
	}

	public Product(String productName, List<Brand> brands) {
		super();
		ProductName = productName;
		this.brands = brands;
	}

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public List<Brand> getBrands() {
		return brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	
}
