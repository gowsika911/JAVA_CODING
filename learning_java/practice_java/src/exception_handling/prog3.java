package exception_handling;

public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int err =0;
		try
		{
			int a=10;
			err=0;
		}
		catch(Exception e)
		{
			err=1;
		}
		
		// use of finally keyword
		finally {
			if(err==1) {
			System.out.println("i am gowsika");
		}
			else {
				System.out.println("no error");
				
			}

	}

}
}
