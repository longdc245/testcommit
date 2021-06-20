package main.java.fireice.beans;

public class Employee {

	// Id employee
	private String id;
	// Name of employee
	private String name;
	// Phone number
	private String phoneNumber;
	// Age
	private int age;
	// Management level
	// 1: Administrator
	// 2: Manager
	// 3: Employee
	private int level;

	public Employee() {
	}

	public Employee(String id, String name, String phoneNumber, int age, int level) {
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
