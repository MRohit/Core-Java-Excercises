package abstract_class;

public class Client extends Shape{
	public static void main(String[] args) {
		
		Shape s=new Rectangle(4f,5f);
		s.Area();
		Shape s1=new Triangle(4f,5f);
		s1.Area();
		Shape s2=new Circle(14f);
		s2.Area();
	}
}
//Ans a:Cannot instantiate Shape class
//Ans b:One can override it or may be not
//Ans c:Area gets calculated
//Ans d:It calls the respected methods of the various classes depending on the type of object
