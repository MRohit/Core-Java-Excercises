package Lab_9;

public class PassbyValue {
	int d,m,y;
	public PassbyValue(){
		d=m=y=11;
	}
	public PassbyValue(int d,int m,int y){
		this.d=d;
		this.m=m;
		this.y=y;
	}
	public static void swap(PassbyValue []darr){
		PassbyValue temp;
		temp=darr[0];
		darr[0]=darr[1];
		darr[1]=temp;
	}
	public String toString(){
		return d+"/"+m+"/"+y;
	}
	public static void main(String args[]) {
		PassbyValue arr[]=new PassbyValue[2];
		arr[0]=new PassbyValue(1, 2, 3);
		arr[1]=new PassbyValue(4,5,6);
		System.out.println("Before Swapping");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		swap(arr);
		System.out.println("After Swapping");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}
