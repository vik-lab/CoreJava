package coreJava;

public class IndiaTime 
{	
	int time = 0;
	
	public static void main (String args[])
	{
		IndiaTime z = new IndiaTime();
		
		while (z.time < 24)
		{
			System.out.println("When time in India is " + z.time + " In NZ it is " + (z.time+7.5));
			z.time++;
		}
	
	}	

}
