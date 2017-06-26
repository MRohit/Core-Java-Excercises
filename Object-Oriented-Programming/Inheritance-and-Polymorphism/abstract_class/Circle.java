package abstract_class;
import static java.lang.Math.pow;;
public class Circle extends Shape{
	float r;

	public Circle() {

		r=5f;
	}
	public Circle(float r){
		this.r=r;
	}
	public void Area() {
		// TODO Auto-generated method stub
		float result=0.0f;
		result=(float) (3.14*pow(r,2));
		System.out.println("Area of Circle is:"+result);
	}
}
