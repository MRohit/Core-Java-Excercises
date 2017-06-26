package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Vector;

public class SortUtil {
	@SuppressWarnings("unchecked")
	public void Sort(List<Employee> ls){
		
		System.out.println("In sorted Manner");
		Iterator i=ls.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Employee> ls=new Vector<Employee>();
		ls.add(new Employee(1,"ABC",55555));
		ls.add(new Employee(2,"CDE",5555));
		ls.add(new Employee(3,"EFG",55556));
		ls.add(new Employee(4,"GHI",555));
		ls.add(new Employee(5,"IJK",555321));
		ls.add(new Employee(6,"KLM",55));
		
		SortUtil s=new SortUtil();
		s.Sort(ls);
	
	}
}
