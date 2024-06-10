package example.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	private String customerId;
	private String name;
	private int age;
	// @Autowired
	@Autowired(required = false) //Make it OPTIONAL
	@Qualifier("addr") //or use @Primary in config class
	private Address permentAddress;

	public Customer() {

	}

	public Customer(String customerId, String name, int age, Address permentAddress) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.age = age;
		this.permentAddress = permentAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getPermentAddress() {
		return permentAddress;
	}

	public void setPermentAddress(Address permentAddress) {
		this.permentAddress = permentAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", age=" + age + ", permentAddress="
				+ permentAddress + "]";
	}

}
