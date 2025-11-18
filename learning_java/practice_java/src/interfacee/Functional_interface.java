package interfacee;
              // lambda expression in java
interface A
{
	void disp();
}
public class Functional_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// fuctional interface 
		
		/*	A obj = new A()
		{
			public void disp()
			{
				System.out.println("display");
			}
		};
		obj.disp();
*/
		
		
		// lambda interface
		A obj = ()->
			{
				System.out.println("display");
			};
			//or 
		A obj2=()->{System.out.println("display 12345");};
		obj.disp();
		obj2.disp();
		
		
	}

}
