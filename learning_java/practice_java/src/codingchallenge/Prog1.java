package codingchallenge;
class divieg
{
	void divinum(int numer,int denomi)
	{
		try
		{
			int res;
            System.out.println(res = numer/denomi);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
}

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divieg e =new divieg();
		e.divinum(10, 0);

	}

}
