public class student {
	int marks;                                                        //construtor overloading or java constructor
	String name;
	student(int a,String b)
	{
		System.out.println("DPCO MARKS😂😂😂🤣");
        marks=a;
        name=b;
    }
    

public static void main(String[] args)
	{
		student ob1=new student(24,"gowsi");
		student ob2=new student(24,"manju");
        System.out.println(String.format("%d,%s",ob1.marks,ob1.name));
	}

}

