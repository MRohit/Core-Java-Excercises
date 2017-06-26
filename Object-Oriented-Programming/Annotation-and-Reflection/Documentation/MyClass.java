package Documentation;

public class MyClass {
	public static void main(String[] args) {
		MyClass a=new MyClass();
		a.meth1();
		a.meth2();
	}
	public void meth2(){
		System.out.println("In method 2");
	}
	@Test_Documention(doTestDocument="Testing the document")
	public void meth1(){
		System.out.println("In method 1");
	}
}
