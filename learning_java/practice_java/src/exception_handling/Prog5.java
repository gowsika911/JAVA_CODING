package exception_handling;
import java.util.Scanner;
class Invalid extends Exception{

	public Invalid(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	
}

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		try {
			int age = s.nextInt();
			if(age<18)
			{
				throw new Invalid("age sholud be greater than 18");
			}
		}
		catch(Invalid e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
