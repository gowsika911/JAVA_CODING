package interfacee;
interface playable
{
	void play();
}
class guitar implements playable
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("guitoro");
	}
	
}
class piano implements playable
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("piano");
	}
	
}
public class Eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            piano p1 = new piano();
            p1.play();
	}

}
