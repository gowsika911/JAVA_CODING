package exception_handling;
import java.util.Scanner;


public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
// input mismatchexception
   try {
   int a =s.nextInt(); 
   }
   catch(Exception e)    //in 'e' space we can use any
   {
	   //System.out.println(e); -> displays what error
	   System.out.println("exception handled");
   }
   System.out.println("program ended");
	}

}
