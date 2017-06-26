package InnerClass;

public interface InterfaceEmployee {
	int emp_id=1;
	String name="ABC";
	double sal=100;
	float gross_sal = 12.5f;
	float net_sal=1505.5f;
	/*InterfaceEmployee () {
		emp_id=1;
		name="ABC";
		sal=233.3f;
	}
	InterfaceEmployee (int emp_id,String name,double sal,float hra,float med) {
		this.emp_id=emp_id;
		this.name=name;
		this.sal=sal;
		this.hra=hra;
		this.med=med;
	}*/
	@Override
	public String toString();
	void Calculate();
	public void print();
}
