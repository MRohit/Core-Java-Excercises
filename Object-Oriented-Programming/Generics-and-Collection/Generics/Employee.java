package Generics;



import java.util.Set;

public class Employee {
	int emp_id;
	String name;
	double sal;
	Set<String> skillsets;
	public Employee() {
		emp_id=1;
		name="ABC";
		sal=123.3;
		skillsets.add("Good");
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_id, String name, double sal) {
		//super();
		this.emp_id = emp_id;
		this.name = name;
		this.sal = sal;
		//this.skillsets=skillsets;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Details:"+emp_id+"\t"+name+"\t"+sal;
	}
	
	
}



