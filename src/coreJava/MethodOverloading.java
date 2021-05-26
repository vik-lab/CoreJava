package coreJava;

public class MethodOverloading 
{
	public void add (int a, int b)
	{
		System.out.println("sum of two int" + (a+b));
	}

	public void add (int a, int b, int c)
	{
		System.out.println("sum of three int" + (a+b+c));
	
	}
	
	public static void main (String args[])
	{
		MethodOverloading X = new MethodOverloading();
		
		X.add(10, 20);
		X.add(10, 200, 300);
	}
}
