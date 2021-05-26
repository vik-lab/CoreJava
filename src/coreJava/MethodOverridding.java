package coreJava;

class one 
{
	void m1(int x)
	{
		System.out.println(x*x);
	}
}

public class MethodOverridding extends one 
{
	void m1(int x)
	{
		System.out.println(x+x);
	
	}
	
	public static void main (String args[])
	{
		one obj1 = new one();
		MethodOverridding obj2 = new MethodOverridding();

		obj1.m1(10);
		obj2.m1(20);
	}
	
	
}
