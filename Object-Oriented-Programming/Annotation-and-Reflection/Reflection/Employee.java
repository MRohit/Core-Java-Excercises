package Reflection;

public class Employee {
	int id;
	String name;
	int sal;
	public Employee() {
		id=0;
		name="";
		sal=0;
	}
	public Employee(int id, String name, int sal)  {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}

