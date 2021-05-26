package coreJava;

public class Constructors 
{
	public Constructors()
	{
		System.out.println("This is a statement in a constructor");
	}
	
	public void m2()
	{
		System.out.println("this is a statement in a method m2");
	}
	
	public static void main (String args[])
	{
		Constructors Z = new Constructors(); //contructor executes automatically at the time of object creation
		Z.m2();
	}

}
