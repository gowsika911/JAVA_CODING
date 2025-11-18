package codingchallenge;
class counter{
	static int count=0;
	int in=0;
	counter()
	{
		count++;
		in++;
	}
	void disp()
	{
		System.out.println(count);
		System.out.println(in);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter c1 =new counter();
		c1.disp();
		counter c2 =new counter();
		c2.disp();
		counter c3 =new counter();
		
		c3.disp();
		c1.disp();

	}

}
