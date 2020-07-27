package fr.inti.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="hotels")
public class Hotel implements Serializable {
	
	//attributes 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String phone;
	
	//associations
	//One hotel get one address
	@Embedded
	@AttributeOverrides ({
		@AttributeOverride(name="country", column= @Column(name="add_country")),
		@AttributeOverride(name="postalCode", column= @Column(name="add_postalCode")),
		@AttributeOverride(name="city", column= @Column(name="add_city")),
		@AttributeOverride(name="street", column= @Column(name="add_street")),
		@AttributeOverride(name="number", column= @Column(name="add_number")),
		@AttributeOverride(name="furtherInformation", column= @Column(name="add_furtherInformation"))
	})
	private Address address;
	//One hotel get at least one rooms or more 
	@OneToMany(mappedBy="hotel")
	private List<Room> listRooms;

	//One hotel get one director 
	@OneToOne(mappedBy="hotel")
	private Director director;
	
	//and at least one or more employees
	@OneToMany(mappedBy="hotel")
	private List<Employee> listEmployees;
	
	//Get the photos of the hotel for 
	@OneToMany(mappedBy="hotel")
	private List<Photo> listPhotos;
	
	//Getters and Setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	
	//toString 
	
		@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
