package abstract_class;

public class Rectangle extends Shape {
	float l,b;
	
	public Rectangle() {
		l=2f;
		b=4f;
	}
	public Rectangle(float l,float b){
		this.l=l;
		this.b=b;
	}
	public void Area() {
		// TODO Auto-generated method stub
			float result;
			result=b*l;
			System.out.println("Area of Rectangle is:"+result);
	}
}
