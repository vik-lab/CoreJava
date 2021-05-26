package coreJava;

class B
{
	protected void m1()
	{
		System.out.println("hi ... ");
	}
}

public class A extends B
{
	public static void main (String args[])
	{
		
	A x = new A();
	
	x.m1();
	
    }

}
