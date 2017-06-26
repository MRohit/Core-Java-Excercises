package Extra_Assignments;

public class GenWild <T>{
	
	public double Calculate(double...x){
		int i;
		double sum=0;
		for(i=0;i<x.length;i++){
			 sum = sum + x[i];
		}
		sum=sum/x.length;
		return sum;
	}
	boolean SameAvg(GenWild <?>ob){
		if(this.equals(ob))
			return true;
		else
			return false;
		
	}
}
