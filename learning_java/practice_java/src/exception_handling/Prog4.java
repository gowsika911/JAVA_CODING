package exception_handling;
import java.util.Scanner;
//throw keyword
public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		try {
			int age = s.nextInt();
			if(age<0)
			{
				throw new ArithmeticException("age sholud be greater than one");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("program stoped");
		}

	}

}
