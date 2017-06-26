package Extra_Assignments;

public class GenWildDemo {
	public static void main(String[] args) {
		GenWild g=new GenWild<Integer>();
		System.out.println(g.Calculate(12,23,34,45,56));
		
		GenWild g1=new GenWild<Float>();
		System.out.println(g1.Calculate(12.3f,23.5f,34.9f,45.1f,56.3f));
		
		if(g.SameAvg(g1)==true)
			System.out.println("Average is same");
		else
			System.out.println("Average is different");
		
		GenWild g2=new GenWild<Double>();
		System.out.println(g2.Calculate(11.3f,2.5f,14.9f,47.1f,96.3f));
		System.out.println(g2.Calculate(12.3f,23.5f,34.9f,45.1f,56.3f));
		
		if(g.SameAvg(g2)==true)
			System.out.println("Average is same");
		else
			System.out.println("Average is different");
		
		if(g1.SameAvg(g2)==true)
			System.out.println("Average is same");
		else
			System.out.println("Average is different");
		
		if(g2.SameAvg(g2)==true)
			System.out.println("Average is same");
		else
			System.out.println("Average is different");
	}
}
