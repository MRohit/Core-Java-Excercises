package String_Class;

public class Calculator {
	public static void main(String[] args) {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		String s=args[2];
		switch (s){
		case "Add":
			System.out.println(n1+n2);
		break;
		case "Sub":
			System.out.println(n1-n2);
		break;
		case "Mul":
			System.out.println(n1*n2);
		break;
		case "Div":
			System.out.println(n1/n2);
		break;
		}
	}
}
