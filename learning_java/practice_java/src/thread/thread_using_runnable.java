package thread;
class D implements Runnable{
	public void run()
	{
		System.out.println("hey hello");
	}
}
class E implements Runnable{
	public void run()
	{
		System.out.println(" hello");
	}
}
public class thread_using_runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable ob = new D();
        Runnable ob1 = new E();
       Thread t1 = new Thread(ob1);
       Thread t11 = new Thread(ob);
t1.start();
       t11.start();
	}

}
