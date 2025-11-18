package codingchallenge;

abstract class animal
{
	String name;
	animal(String name)
	{
		this.name=name;
	}
	
	abstract void makesound();
}
class dog extends animal{
	dog(String name)
	{
		super(name);
		System.out.println(super.name);
	}

	@Override
	void makesound() {
		// TODO Auto-generated method stub
		System.out.println("bow...bow");
		
	}
	
}
class cat extends animal
{
	cat(String name)
	{
		super(name);
	}

	@Override
	void makesound() {
		// TODO Auto-generated method stub
		System.out.println("meow");
		
	}
	
}
class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d1 = new dog("bobie");
		System.out.println();
		d1.makesound();
		
		cat c1 = new cat("muna");
		System.out.println(c1.name);
		c1.makesound();

	}

}
