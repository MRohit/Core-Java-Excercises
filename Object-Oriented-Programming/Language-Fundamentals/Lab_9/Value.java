package Lab_9;

public class Value {

	int d,m,y;
	public Value(){
		d=m=y=11;
	}
	public Value(int d,int m,int y){
		this.d=d;
		this.m=m;
		this.y=y;
	}
	public static void swap(Value d1,Value d2){
		int temp;
		temp=d1.d;
		d1.d=d2.d;
		d2.d=temp;
	}
	public String toString(){
		return d+"/"+m+"/"+y;
	}
	public static void main(String[] args) {
		Value d=new Value(1,2,3);
		Value d1=new Value(4,5,6);
		System.out.println("Before Swapping");
		System.out.println(d);
		System.out.println(d1);
		swap(d,d1);
		System.out.println("After Swapping");
		System.out.println(d);
		System.out.println(d1);
	}
}
