import java.io.IOException;
import java.text.ParseException;

import javax.xml.datatype.DatatypeConfigurationException;


public class DivisionDemp {
	public static void main(String[] args) throws IOException {
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c;
		
		
			c=a/b;
			System.out.println("Division is:"+c);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			//.printStackTrace();
			System.out.println("Please enter two numbers");
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}
