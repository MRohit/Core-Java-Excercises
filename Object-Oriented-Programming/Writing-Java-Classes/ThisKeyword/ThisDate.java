package ThisKeyword;

public class ThisDate {
	int d,m,y;
	ThisDate() {
		this(12);
	}

	ThisDate (int d) {
		this(12,2013);
		this.d=d;
		
	}

	ThisDate(int m,int y) {
		this.m=m;
		this.y=y;
	}
	void ShowDate(){
		System.out.println("Date is:"+d+"/"+m+"/"+y);
	}

	public static void main(String[] args) 
	{
		ThisDate d=new ThisDate();
		d.ShowDate();
		

	}
}
