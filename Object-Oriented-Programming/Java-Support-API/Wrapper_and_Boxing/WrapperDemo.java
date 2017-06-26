package Wrapper_and_Boxing;

public class WrapperDemo {
	WrapperDemo(){
		int val=10;
		Integer x=new Integer(val);
		System.out.println("Primitive to wrapper:"+x);
		int val2=x.intValue();
		System.out.println("Wrapper to primitive:"+val2);
		String s="30";
		int i=Integer.parseInt(s);
		System.out.println("String to primitive:"+i);
		String s2="3546";
		int y=Integer.valueOf(s2);
		System.out.println("String to wrapper:"+y);
		
	}
	public static void main(String[] args) {
		WrapperDemo w=new WrapperDemo();
	}
}
