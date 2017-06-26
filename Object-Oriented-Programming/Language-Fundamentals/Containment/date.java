package Containment;

public class date {
	static int d,m,y;
	public date(){
		d=m=y=11;
	}
	public date(int dd,int mm,int yy){
		d=dd;
		m=mm;
		y=yy;
	}
	public static void showdate() {
		System.out.println(+d+"/"+m+"/"+y);
	}
	public String toString(){
		return "Date is:"+d+"/"+m+"/"+y;
	}
}
