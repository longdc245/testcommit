package main.java.fireice.beans;

public class Customer {

	// Id of customer
	private String id;
	// Name of customer
	private String name;
	// Phone number of customer
	private String phoneNumber;
	// Age of customer
	private int age;
	// Customer level
	// 1: Vip
	// 2: Normal
	private int level;

	public Customer() {
	}

	public Customer(String id, String name, String phoneNumber, int age, int level) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.level = level;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
