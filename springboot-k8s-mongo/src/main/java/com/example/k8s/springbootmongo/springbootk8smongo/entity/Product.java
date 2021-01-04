package com.example.k8s.springbootmongo.springbootk8smongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class Product {
	 @Id  
    private Long id;
    private String ConstellationsId;
    private String description;
    private String orbit;
    private String health;
    

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getConstellationsId() {
		return ConstellationsId;
	}
	public void setConstellationsId(String ConstellationsId) {
		this.ConstellationsId = ConstellationsId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getorbit() {
		return orbit;
	}
	public void setorbit(String orbit) {
		this.orbit = orbit;
	}
	public String gethealth() {
		return health;
	}
	public void sethealth(String health) {
		this.health = health;
	}
    
    
}