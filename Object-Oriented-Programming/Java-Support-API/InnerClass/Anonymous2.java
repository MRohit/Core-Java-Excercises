package InnerClass;

public class Anonymous2 {
	int i=10;
	InterfaceEmployee e=new InterfaceEmployee(){
		int x=20;
		void show(){
			System.out.println("In the anonymous class");
		}
		public void Calculate() {
			show();
			System.out.println("In the calculate method of anonymous class using Interface");
		}
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("In print method of anonymous class using Interface");
		}
	};
	public static void main(String[] args) {
		Anonymous a=new Anonymous();
		a.e.Calculate();
	}
}
