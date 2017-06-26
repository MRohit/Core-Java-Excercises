package interface_class;

public class Client {
	public static void main(String[] args) {
		Shape s=new Triangle(5f, 6f);
		s.Area();
		s.Print();
		Employee e=new Employee();
		e.Print();
		Date d=new Date();
		d.Print();
		
	}
}
