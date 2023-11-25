package SerializationFolder;

import java.io.Serializable;
//here Serializable is an marker interface
public class Student implements Serializable{
	
	private int id;
	private String name;
	private String college;
	private String city;
	public Student(int id, String name, String college, String city) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void displayName() {
		System.out.println("my name is "+this.name);
	}
	

}
