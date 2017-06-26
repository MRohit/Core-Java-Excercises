
public class Client {
	public static void ShowDetails (Employee e){
		if (e instanceof Manager) {
			e.Calculate();
			System.out.println(e);
		}else {
			e.Calculate();
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Employee m2=new Manager(1,"cvc",2000f,200f,200f,200f,500f,500f);
		ShowDetails(m2);
		Employee e1=new MarketingExecutive(1,"asd",123,123.3f,1.5f,123.5f,1,1500f);
		ShowDetails(e1);
	}
}
