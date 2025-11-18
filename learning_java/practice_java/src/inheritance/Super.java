package inheritance;
class person{
	String name;
	person(String name)
	{
		this.name=name;
	}
}
class employee extends person{
	employee(String name)
	{
		super(name);
		System.out.println(super.name);
	}
}

public class Super {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p = new person("gowsi");
		System.out.println(p.name);
		employee e =new employee("gowsika");
		System.out.println(e.name);
		

	}

}
