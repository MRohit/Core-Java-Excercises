package Date;

public class date {
	int d,m,y;
	public date(){
		d=m=y=11;
	}
	public void showdate() {
		System.out.println(+d+"/"+m+"/"+y);
	}
	public static void main(String[] args) {
		date d=new date();
		d.showdate();
	}
}
