package codingchallenge;
abstract class vehicle
{
	final void startengine()
	{
		System.out.println("engine started");
	}
	static String getVehicleType()
	{
		return "car";
	}
	abstract void drive();
}
class car extends vehicle{
	void drive()
	{
		System.out.println("driving fast");
	}
}
class motorcycle extends vehicle
{
	void drive()
	{
		System.out.println("sllow");
	}
}

public class mai {
	public static void main(String[] args)
	{
		car c1 = new car();
		c1.startengine();
	}

}
