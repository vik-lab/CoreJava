package coreJava;

public class LocalVariableEg 
{
	public void m1()
	{
		int a = 10; //this is a local variable as its declared in the method
		System.out.println("this is the first method");
		System.out.println(a); //it can only be used within the same method
	}
	
	public void m2()
	{
		System.out.println("this is the second method");
	}

	public static void main (String args[])
	{
		LocalVariableEg Z = new LocalVariableEg();
		Z.m1();
		Z.m2();
		
	}
}
