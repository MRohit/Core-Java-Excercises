package Extra_Assignments;

public class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> g=new Gen<Integer>(5);
		System.out.println(g.GetData());
		
		Gen<String> g1=new Gen<String>("ABCD");
		System.out.println(g1.GetData());
		
		Gen<Float> g2=new Gen<Float>(123.4f);
		System.out.println(g2.GetData());
		
		
	}

}
