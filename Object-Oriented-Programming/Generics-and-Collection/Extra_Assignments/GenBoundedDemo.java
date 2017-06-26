package Extra_Assignments;

public class GenBoundedDemo {
	
	public static void main(String[] args) {
		GenBounded g=new GenBounded<Integer>(20);
		System.out.println(g.GetData());
		
		GenBounded g1=new GenBounded<Float>(123.4f);
		System.out.println(g1.GetData());
		
		//GenBounded g3=new GenBounded<String>("Seed");
		//System.out.println(g3.GetData());
	}
}
