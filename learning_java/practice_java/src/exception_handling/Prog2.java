package exception_handling;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		   /*try {
		   int a =s.nextInt(); 
		   int b =10/0;
		   }
		   catch(InputMismatchException e)    
		   {
			   
			   System.out.println(e);
		   }
		   catch(ArithmeticException e)   
		   {
			   
			   System.out.println("none");
		   }
		   System.out.println("program ended");
			}
           */
		
		
		int a = s.nextInt();
		int b= s.nextInt();
		try {
		System.out.println(a/b);
		
		}
		catch(Exception e)
		{
			System.out.println("program ended");
		}
		System.out.println("programed");

}
}
