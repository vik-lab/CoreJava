package coreJava;

public class InstanceVariable 
{
	int a = 10; //instance variable declared outside any methods
	
	public void m1()
	{
		System.out.println("this is first method");
		System.out.println(a);
	}
	
	public void m2()
	{
		System.out.println("this is second method");
		System.out.println(a);
	}
	
	public static void main (String args[])
	{
		InstanceVariable Z = new InstanceVariable();
		
		//System.out.println(Z.a);
		Z.m1();
		Z.m2();
	}

}
