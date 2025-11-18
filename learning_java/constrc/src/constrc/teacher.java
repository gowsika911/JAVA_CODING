 ///this keyword use
package constrc;            

public class teacher {
	
    String gowsi;
	teacher()
	{
		System.out.println("hello");
	}
	void setname(String gowsi)
	{
		// gowsi=gowsi;   //  in output comes as null
		this.gowsi=gowsi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teacher t1=new teacher();
		t1.setname("gowsika");
		System.out.println(t1.gowsi);

	}

}
