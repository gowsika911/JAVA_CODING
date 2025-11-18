package thread;
class C extends Thread
{
	int j=0;
	public void run()
	{
		j=50;
	}
}

public class join_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C a1 = new C();
		a1.start();    // thread started
		try {
			a1.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}     // join method is used to wait until tread work will completes
		System.out.println(a1.j);

	}

}
