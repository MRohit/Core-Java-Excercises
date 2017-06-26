package Containment;

public class Employee {

	int emp_id;
	String name;
	double sal;
	date dob;
	Employee(){
		emp_id=1;
		name="ABC";
		sal=22222;
		dob=new date();
	}
	Employee(int id,String n,double s,date dob){
		emp_id=id;
		name=n;
		sal=s;
		this.dob=dob;
	}
	public String toString(){
		return "Employee Details:"+emp_id+"\t"+name+"\t"+sal+ "\t"+dob;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		System.out.println(e1);
		Employee e2=new Employee(2,"XYZ",33333,new date(16,2,2014));
		System.out.println(e2);
	}

}
