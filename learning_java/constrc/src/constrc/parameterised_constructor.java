// parameterised constructor or constructor ovrloading

package constrc;

public class parameterised_constructor {
	int marks;
    String name;
    parameterised_constructor()
    {
    	System.out.println("gowsi");
    }

     parameterised_constructor(int a)
    {
    	 System.out.println(a);
    	System.out.println("hello");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   parameterised_constructor ob1 = new parameterised_constructor(10);
		   parameterised_constructor ob2 = new parameterised_constructor();
                 
}
}
                                                                                  