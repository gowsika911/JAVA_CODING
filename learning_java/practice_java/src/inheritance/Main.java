package inheritance;
class Animal{
	String name;
	int age;
	void makesound(){
		System.out.println("animal makes sound");
		
	}
}
class dog extends Animal{
	String breed;
	@Override
	void makesound() {
		// TODO Auto-generated method stub
	
		System.out.println("dog bargs sound");
	}
	void fetch()
	{
		System.out.println("dog is fetching");
	}
	}
class cat extends Animal{
	String color;
	@Override
	void makesound() {
		// TODO Auto-generated method stub
		
		System.out.println("cat meows");
	}
	void climb() {
		System.out.println("cat is climbing");
	}
}
	
public class Main{
	public static void main(String[] args) {
		Animal ani=new Animal();
		ani.makesound();
		dog d1=new dog();
		d1.name="somu";
		d1.age=2;
		d1.breed="gold";
		d1.makesound();
		d1.fetch();
		cat c1=new cat();
		c1.name="somu";
		c1.age=2;
		c1.color="gold";
		c1.makesound();
		c1.climb();
	    
	}

}
