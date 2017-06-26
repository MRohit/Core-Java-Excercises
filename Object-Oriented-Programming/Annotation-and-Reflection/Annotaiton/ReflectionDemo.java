package Annotaiton;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectionDemo  {
	
	public static void main(String[] args) throws ClassNotFoundException  {
		String name="";
		Class myClass =Class.forName("Employee");
		System.out.println("File entered :"+myClass);
		
		
		Class sname=myClass.getClass();
		System.out.println("Class name : "+sname);
		
		Method method[]=myClass.getMethods();
		System.out.println("Methods : ");
		for(int i=0;i<method.length;i++) {
			System.out.println(method[i]);
		}
		
		
		Constructor con[]=myClass.getConstructors();
		{
			System.out.println("\n");
			System.out.println("Constructors : ");
			for(int i=0;i<con.length;i++){
				System.out.println(con[i]);
			}
			
			
			System.out.println("\n");
			Field field[]=myClass.getDeclaredFields();
			System.out.println("Fields  : ");
			for(int i=0;i<field.length;i++){
				System.out.println(field[i]);
			}
			
			for(int i=0;i<method.length;i++) {
			System.out.println("Annotation :"+method[i].getAnnotation(CityInfo.class));
			}
		}
	}
}
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
