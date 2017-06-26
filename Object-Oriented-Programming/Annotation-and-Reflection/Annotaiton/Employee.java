package Annotaiton;


public class Employee 
{
	int id;
	String name;
	int sal;
	public Employee() {
		id=0;
		name="";
		sal=0;
	}
	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@CityInfo(ct_name="Pune",zip=411041)
	public void getInfo() {
		System.out.println("Employee id=" + id + ", name=" + name + ", sal=" + sal + "]");
	}
	
	
}

