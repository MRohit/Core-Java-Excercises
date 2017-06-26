package Extra_Assignments;

public class GenTwoDemo {
	public static void main(String[] args) {
		GenTwo<Integer,Float> g=new GenTwo<Integer,Float>(5,66.5f);
		Integer i=g.GetData1();
		System.out.println(i.getClass().getName());
		//System.out.println(g.GetData2());
		Float f=g.GetData2();
		System.out.println(f.getClass().getName());
		
		GenTwo<String,Integer> g1=new GenTwo<String,Integer>("ABCD",123);
		System.out.println(g1.GetData1());
		System.out.println(g1.GetData2());
		
		GenTwo<Float,String> g2=new GenTwo<Float,String>(123.4f,"EFGHI");
		System.out.println(g2.GetData1());
		System.out.println(g2.GetData2());
		
		
	}
}
