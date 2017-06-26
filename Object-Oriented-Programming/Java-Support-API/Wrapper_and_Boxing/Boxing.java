package Wrapper_and_Boxing;

public class Boxing {
	Boxing(){
		int val=10;
		Integer x=new Integer(val);
		System.out.println("Boxing Mechanism");
		System.out.println("Primitive to wrapper:"+x);
		
		System.out.println("Unboxing Mechanism");
		int val2=x.intValue();
		System.out.println("Wrapper to primitive:"+val2);
		
		System.out.println("AutoBoxing");
		Integer i=x;
		System.out.println(i);
		System.out.println("Auto Unboxing");
		
		int y=i;
		System.out.println(+y);
		/*String s="30";
		int i=Integer.parseInt(s);
		System.out.println("String to primitive:"+i);
		String s2="3546";
		int y=Integer.valueOf(s2);
		System.out.println("String to wrapper:"+y);*/
	}
	public static void main(String[] args) {
		Boxing b=new Boxing();
	}
}
