package inheritance;
class student{
	static int mark=0;
	static String teacher =" gowsi";
	static void display()
	{
		System.out.println("minu");
	}
	
	// static block
	
	static {
		System.out.println("mental here");
		
	}
}

public class Static_member {
	 static int a=10;

	public static void main(String[] args) {
		student s1 = new student();
		s1.mark=67;
		// TODO Auto-generated method stub
		student s2 = new student();
		s2.mark=90;
		student.teacher="ladu";
		System.out.println(student.teacher);
		student.display();  ///acessing through class name for static function and static field
		System.out.println(a);//static member can access another static member only
		System.out.println("hello");
	}

}
