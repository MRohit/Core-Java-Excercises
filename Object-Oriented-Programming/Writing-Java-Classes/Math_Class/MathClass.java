package Math_Class;

public class MathClass {
	int a,b;
	int add(int a,int b) {
		return a+b;
	}
	float add(int a,float b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	String add(String s1,String s2) {
		return s1+s2;
	}
	public static void main(String[] args) 
	{
		MathClass m=new MathClass();
		System.out.println(m.add(11,22));
		System.out.println(m.add(11,22.55f));
		System.out.println(m.add(11,22,44));
		System.out.println(m.add("ABC","DEF"));
	}
}
