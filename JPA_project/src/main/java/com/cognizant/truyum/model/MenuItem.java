package com.cognizant.truyum.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu_item")
public class MenuItem {
	
//	//me_id int AI PK 
//	me_name varchar(100) 
//	me_price decimal(8,2) 
//	me_active varchar(3) 
//	me_date_of_launch date 
//	me_category varchar(45) 
//	me_free_delivery varchar(3)
	

	
	@Id
	@Column(name = "me_id")
	private long id;
	@Column(name = "me_name")
	private String name;
	@Column(name = "me_price")
	private float price;
	@Column(name = "me_active")
	private boolean active;
	@Column(name = "me_date_of_launch")
	private Date dateOfLaunch;
	@Column(name = "me_category")
	private String category;
	@Column(name = "me_free_delivery")
	private boolean freeDelivery;

	
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuItem(long id, String name, float price, boolean active, Date dateOfLaunch, 
			String category, boolean freeDelivery) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.category = category;
		this.freeDelivery = freeDelivery;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isFreeDelivery() {
		return freeDelivery;
	}

	public void setFreeDelivery(boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}

	@Override
	public String toString() {
		return "Id = " + id + "\nName = " + name + "\nPrice = " + price + "\nActive = " + active +
				"\nDate Of Launch = " + dateOfLaunch + "\nCategory = " + category + 
				"\nFree Delivery = " + freeDelivery + "\n***************************************";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuItem other = (MenuItem) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
