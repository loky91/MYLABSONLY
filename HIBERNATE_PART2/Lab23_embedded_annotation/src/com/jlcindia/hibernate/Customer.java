package com.jlcindia.hibernate;
import javax.persistence.*;


@Entity
@Table(name="customer5")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	
	
	private String name;

	@Embedded
	
	@AttributeOverrides(value= {
			
	@AttributeOverride(name="street",
			column=@Column(name="mystreet")),
	@AttributeOverride(name="city",
	column=@Column(name="mycity"))
	
	})
private Address address;
	
	public Customer() {}

	public Customer(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
	
	


	
}
