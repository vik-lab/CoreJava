package coreJava;

public class StaticVariable 
{
	static int a = 100;
	
	public static void main (String args[])
	{
		//StaticVariable Z = new StaticVariable();
		
		System.out.println(StaticVariable.a); //static variable can be called by using the class name dont need to create a reference to the class to call it.
		
	}

}
