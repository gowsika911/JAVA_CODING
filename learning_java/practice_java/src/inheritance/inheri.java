package inheritance;
class animal {
	void eat()
	{
		System.out.println(" will eats");
	}
	
}
class dogs extends animal {
	void bark()
	{
		System.out.println("barks");
	}
	
}
class cats extends animal {
	void me()
	{
		System.out.println(" meowss");
	}
}
class puppy extends dogs{
		void pps()
		{
			System.out.println(" weeps");
		}
		
	}
	
public class inheri {
	public static void main(String[] args)
	{
		dogs d=new dogs();
		d.eat();
		puppy p=new puppy();
		p.pps();
		p.eat();
		p.bark();
	}

}
