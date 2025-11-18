package exception_handling;
class calc{
	void divi() throws Exception
	{   
		
		int a =10/0;
	}
}
public class Prog6 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		calc c =new calc();
		try {
		c.divi();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
