package codingchallenge;
abstract class vehicle
{
	final void startEngine() {
		System.out.println("start driving");
		
	}
	static String getVehicleType()
	{
		return "cars";
	}
	abstract void drive();
}
class car extends vehicle
{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("speed slow");
	}
	
}
class motorcycle extends vehicle
{
	void drive()
	{
		System.out.println("speed high");
	}
	
}

public class vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
