package coreJava;

public class ExceptionHandling 
{
	public static void main (String args[])
	{
		try
		{
		int a[] = {10,20,30,40,50};
		System.out.println("this is value of " + a[0]);
		System.out.println("this statement will be executed if the above statement is true");
		}
		
		catch(Exception x)
		{
			System.out.println(x);
			
			System.out.println("This is the failure route..");
		}
		
	}
}
