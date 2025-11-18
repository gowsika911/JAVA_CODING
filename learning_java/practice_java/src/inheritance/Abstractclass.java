package inheritance;
abstract class vehicle
{
	abstract void speed();
}
class bike extends vehicle{

	@Override
	void speed() {
		System.out.println("35 km/hr");
	}
	
}

public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b =new bike();
		b.speed();

	}

}
