package coreJava;

class x
{
	protected void m1()
	{
		System.out.println("this is class x");
	}
}

class y extends x
{
	protected void m2()
	
	{
		System.out.println("this is class y");
	}
}


public class Z extends y
{
	public static void main (String args[])
	{
		Z obj = new Z();
		
		obj.m1();
		obj.m2();
	}

}
