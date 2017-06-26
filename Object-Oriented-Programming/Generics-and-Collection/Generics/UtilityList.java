package Generics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UtilityList {
	public void PrintList(List ls){
		Iterator i=ls.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		
		List<Employee> ls=new ArrayList<Employee>();
		ls.add(new Employee(1,"ABC",55555));
		ls.add(new Employee(2,"CDE",5555));
		ls.add(new Employee(3,"EFG",55556));
		ls.add(new Employee(4,"GHI",555));
		ls.add(new Employee(5,"IJK",555321));
		ls.add(new Employee(6,"KLM",55));
		UtilityList u=new UtilityList();
		u.PrintList(ls);
	}
}
