package ToString;

public class ToString {

	int emp_id,basic_salary;
	String emp_name;

	ToString(){
		emp_id=1;
		basic_salary=25000;
		emp_name="ABC";
	}
	public String toString() {
		return emp_id+"\t"+emp_name+"\t"+basic_salary;
	}

	public static void main(String[] args) 
	{
		ToString t=new ToString();
		System.out.println("The Details of employee are:\n");
		System.out.println(t);
	}
}
