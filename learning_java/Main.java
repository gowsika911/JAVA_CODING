interface animal{
	int mark = 20;
	void sound();           // abstract by default
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

