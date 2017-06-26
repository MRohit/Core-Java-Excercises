package MyDate;

public class My_Date2 {
int day,month,year;
	
	My_Date2 () {
		day=month=year=1;
	}

	My_Date2 (int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}

	void ShowDate() {
		System.out.println("Todays Date is:"+day+"/"+month+"/"+year);
	}

	public static void main(String[] args)  {
		My_Date2 date=new My_Date2();
		System.out.println("Through No Argument Constructor");
		date.ShowDate();
		My_Date2 date2=new My_Date2(24,12,2013);
		System.out.println("Through Parameterized Constructor");
		date2.ShowDate();
		
	}
}
