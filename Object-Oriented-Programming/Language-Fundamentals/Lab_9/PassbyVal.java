package Lab_9;

public class PassbyVal {

	int d,m,y;
	public PassbyVal(){
		d=m=y=11;
	}
	public PassbyVal(int d,int m,int y){
		this.d=d;
		this.m=m;
		this.y=y;
	}
	public static void swap(PassbyVal d1,PassbyVal d2){
		PassbyVal temp;
		temp=d1;
		d1=d2;
		d2=temp;
	}
	public String toString(){
		return d+"/"+m+"/"+y;
	}
	public static void main(String[] args) {
		
	}
}
