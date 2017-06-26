package Serialization_n_Deserial;

import java.io.Serializable;

public class Student implements Serializable{
	int roll;
	String name;
	double marks;
	public Student() {
		// TODO Auto-generated constructor stub
		roll=1;
		name="ABC";
		marks=12.0;
	}
	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks
				+ "]";
	}
	
}
