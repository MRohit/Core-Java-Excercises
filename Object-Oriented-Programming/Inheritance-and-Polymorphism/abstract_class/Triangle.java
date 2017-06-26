package abstract_class;

public class Triangle extends Shape{
float h,b;
	
	public Triangle() {

		h=2f;
		b=4f;
	}
	public Triangle(float h,float b){
		this.h=h;
		this.b=b;
	}
	public void Area() {
		// TODO Auto-generated method stub
			float result;
			result=(float) (0.5*b*h);
			System.out.println("Area of Triangle is:"+result);
	}
}
