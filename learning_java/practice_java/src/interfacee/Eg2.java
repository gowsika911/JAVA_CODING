package interfacee;
        // Multiple inheritance in java
interface readable{
	void read();
	
}
interface writable
{
	void write();
}
interface storeable
{
	void store();
}
class file implements readable,writable,storeable
{

	@Override
	public void store() {
		// TODO Auto-generated method stub
		System.out.println("stroring");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("writing");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("reading");
	}


	
}

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		file d= new file();
		d.read();
		d.write();
		d.store();

	}

}
