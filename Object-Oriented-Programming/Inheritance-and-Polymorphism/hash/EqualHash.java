package hash;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.System;


public class EqualHash {
	int d,m,y;
	public EqualHash() {
		d=m=y=1;
		// TODO Auto-generated constructor stub
	}
	EqualHash(int dd,int mm,int yy){
		d=dd;
		m=mm;
		y=yy;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return d+"\t"+m+"\t"+y;
	}
	public boolean equals(Object obj){
		EqualHash ho=(EqualHash)obj;
		if(d==ho.d && m==ho.m && y==ho.y )
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 123123;
	}
	public static void main(String[] args) {
		EqualHash e=new EqualHash(1, 2, 3);
		EqualHash e1=new EqualHash(1, 2, 3);
		if(e.equals(e1))
			System.out.println("Dates are equal");
		else
			System.out.println("not Equal");
		System.out.println("Hash code of first object:"+e.hashCode());
		System.out.println("Hash code of first object:"+e1.hashCode());
	}
}
