package Cloning;

public class Date implements Cloneable{
	 int d,m,y;
	public Date(){
		d=m=y=11;
	}
	public void showdate() {
		System.out.println(+d+"/"+m+"/"+y);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Date is:"+d+"/"+m+"/"+y;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Date d=new Date();
		System.out.println(d);
		//Deep Cloning
		Date d2=(Date)d.clone();
		System.out.println(d2);
		System.out.println(d.hashCode());
		System.out.println(d2.hashCode());
		//Shallow Cloning
		Date d3=d;
		System.out.println(d3.hashCode());
		
	}
}
