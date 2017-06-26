package Extra_Assignments;

public class NonGenDemo {
	public static void main(String[] args) {
		int i=10;
		Integer i1=new Integer(i);
		NonGen ig=new NonGen(i1);
		System.out.println(ig.GetData());
		
		String s="Seed";
		String s1=new String(s);
		NonGen ig1=new NonGen(s1);
		System.out.println(ig1.GetData());
		
		ig=ig1;
		int i2=(int) ig.GetData();
		
		System.out.println(ig.GetData());
	}
}
