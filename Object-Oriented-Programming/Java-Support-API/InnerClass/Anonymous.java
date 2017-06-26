package InnerClass;

public class Anonymous {
	int i=10;
	Employee e=new Employee(){
		int x=20;
		void show(){
			System.out.println("In the anonymous class");
		}
		void Calculate() {
			show();
			System.out.println("In the calculate method of anonymous class");
		}
	};
	public static void main(String[] args) {
		Anonymous a=new Anonymous();
		a.e.Calculate();
	}
}
