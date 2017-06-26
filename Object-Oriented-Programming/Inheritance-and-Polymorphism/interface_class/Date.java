package interface_class;

public class Date implements Printable{

	static int d,m,y;
	public Date(){
		d=m=y=11;
	}
	public static void showdate() {
		System.out.println(+d+"/"+m+"/"+y);
	}
	@Override
	public void Print() {
		// TODO Auto-generated method stub
		System.out.println("In Date class of print method");
	}
}
