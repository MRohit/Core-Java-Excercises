package InnerClass;

public class Employee {
	int emp_id;
	String name;
	double sal;
	float net_sal,pf,gross_sal,hra,med;
	Employee () {
		emp_id=1;
		name="ABC";
		sal=233.3f;
	}
	Employee (int emp_id,String name,double sal,float hra,float med) {
		this.emp_id=emp_id;
		this.name=name;
		this.sal=sal;
		this.hra=hra;
		this.med=med;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Details:"+emp_id+"\t"+name+"\t"+sal+"\t"+net_sal+"\t"+pf+"\t"+gross_sal;
	}
	void Calculate(){
		
	}

}
