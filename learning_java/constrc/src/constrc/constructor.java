package constrc;

public class constructor {
	int marks;
    String name;
    constructor()
    {
    	System.out.println("hello");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            constructor ob1 = new constructor();
            constructor ob2 =new constructor();
            System.out.println(ob1.marks);
            System.out.println(ob2.name);
	}

}
