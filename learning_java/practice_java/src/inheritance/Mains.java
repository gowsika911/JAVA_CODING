package inheritance;
class vehicle{
	String brand;
	int year;
	void startEngine()
	{
		System.out.println("engine starts");
	}
}
class car extends vehicle
{
	String fueltype;
	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		
		System.out.println("car engine starts");
	}
	void drive()
	{
		System.out.println("car is driving");
	}
}
class truck extends vehicle
{
	int loadcapacity;
	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		
		System.out.println("truck engine starts");
	}
	void haul()
	{
		System.out.println("truck is hauling");
	}
}


public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v1=new vehicle();
		v1.startEngine();
		car c= new car();
		c.startEngine();
		c.drive();
		truck c1= new truck();
		c1.startEngine();
		c1.haul();



	}

}
