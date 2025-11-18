package inheritance;
// final method can't override
// if use final class it can not inherited
final class A{
	void fun()
	{
		System.out.println("class a");
		
	}
	
}
class B extends A {
	
	
}


public class Final_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=10;

		B b=new B();
		b.fun();
		

	}

}
