package Static_Method;

public class StaticEmployee {

	static int count;
	int emp_id;
	String emp_name;
	double basic_salary,gross_salary;
	
	StaticEmployee () {
		count++;
		emp_id=count;
		emp_name="ABC";
		basic_salary=1;
		gross_salary=1;
	}

	StaticEmployee (String emp_name,double basic_salary,double gross_salary){
		count++;
		emp_id=count;
		this.emp_name=emp_name;
		this.basic_salary=basic_salary;
		this.gross_salary=gross_salary;
	}

	void Show(){
		System.out.println(" "+emp_id+"  "+emp_name+"  "+basic_salary+"  "+gross_salary);
	}
	static void ShowCount() {
		System.out.println("Number of Employee is:"+count);
	}

	public static void main(String[] args) 
	{
		StaticEmployee e=new StaticEmployee();
		e.Show();
		StaticEmployee e1=new StaticEmployee("CDE",123,123);
		e1.Show();
		StaticEmployee e3=new StaticEmployee("RST",121233,12321233);
		e3.Show();
		StaticEmployee e2=new StaticEmployee("PQR",12323,12323);
		e2.Show();
		StaticEmployee.ShowCount();
	}
}
