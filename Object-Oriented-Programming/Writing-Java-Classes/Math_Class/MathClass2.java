package Math_Class;

public class MathClass2 {
	int a,b;
	int add(int...x) {
		int sum=0;
		for(int i=0;i<x.length;i++)
			sum=sum+x[i];
		return sum;
	}
	float add(int a,float b,int...x) {
		float sum=0;
		for(int i=0;i<x.length;i++)
			sum=sum+x[i];
		return sum;
	}
	String add(String...x) {
		String sum="";
		for(int i=0;i<x.length;i++)
			sum=sum+x[i];
		return sum;
	}
	public static void main(String[] args) 
	{
		MathClass2 m=new MathClass2();
		//System.out.println(m.add(1,2,3,4,5,6,7));
		System.out.println(m.add(1,2.5f,3,4,5,6,7,9,64,45,34));
		System.out.println(m.add("ABC","CDE","EFG","HIJ"));
	}
}
