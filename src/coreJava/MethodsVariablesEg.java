package coreJava;

public class MethodsVariablesEg 
{
	int a = 30;
	int b = 40;
	
	public void m1()
	{
		System.out.println("this is method 1");
	}
	
	public void m2()
	{
		System.out.println("this is method 2");
	}
	
	public static void main (String args[])
	{
		MethodsVariablesEg Z = new MethodsVariablesEg();
		
		Z.m1();
		Z.m2();
		
		System.out.println(Z.a);
		System.out.println(Z.b);
	}
	

}
