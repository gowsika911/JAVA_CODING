package interfacee;
interface animal{
	int mark = 20;          // implicitly public static final
	void sound();         // abstract by default
	default void disp()
	{
		                               //and we can create body puting default or static in front of method name
	}
}
class cat implements animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("meoww");
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can not create obj for interface // animal a1 = new animal();
            cat c1 =new cat();
            c1.sound();
            System.out.println(c1.mark);
	}

}
