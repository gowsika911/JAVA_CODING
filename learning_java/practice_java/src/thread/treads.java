package thread;
class A extends Thread{
	public void run()
	{
		for(int i =0;i<11;i++) {
		System.out.println("hello siri");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
class B extends Thread{
	public void run()
	{ 
		for(int i =0;i<11;i++) {
		System.out.println("hey");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}

public class treads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.start();
		B b= new B();
		b.start();
		a.setPriority(10);
		b.setPriority(2);

	}

}
