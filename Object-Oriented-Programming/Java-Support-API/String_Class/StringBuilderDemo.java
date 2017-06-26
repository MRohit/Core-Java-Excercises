package String_Class;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("seed");
		System.out.println("String Capacity is:"+s.capacity());
		
		System.out.println(s.append(" Infotech"));
		System.out.println("Length of the string is:"+s.length());
		System.out.println("Character at 6th position is:"+s.charAt(6));
	}
	
}
