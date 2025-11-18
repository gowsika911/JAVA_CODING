package codingchallenge;

import java.util.Scanner;


class Invalidage extends Exception{

	public Invalidage(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	
}
class Agevalidator{
	void checkage(int age)
	{ 
    try
	{
		if(age<0 || age>150)
		{
		throw new Invalidage("age is invalid");
	     }
	}
    catch(Exception e)
	{
		System.out.println(e);
	}
	
}
	
}
public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agevalidator a = new Agevalidator();
		a.checkage(-1);
}
}
