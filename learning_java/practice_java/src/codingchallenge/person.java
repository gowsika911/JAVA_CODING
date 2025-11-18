package codingchallenge;
 class human {
	public String name;
	protected int age;
	private String ssn;
	String address;
	human(String name, int age,String socialsecurityNnumber,String address)
	{
		this.name=name;
		this.age=age;
	    this.ssn=ssn;
		this.address=address;
		
	}
 }
 class employee extends human
 {
	 employee(String name, int age,String ssn,String address)
	 {
		 super(name,age,ssn,address);
	 }
 }
public class person{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    employee e =new employee("gowsi",20,"ssn","fren");
   // System.out.println(e.name);
    System.out.println(e.age);
    System.out.println(e.sssn);
    


}
}