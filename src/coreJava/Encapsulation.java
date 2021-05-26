package coreJava;

public class Encapsulation 

{
	
	private String name;
	private int age;
	
	public void setName(String x)
	{
		name = x;
	}
	
	public void setAge (int y)
	{
		age = y;
	}
	
	public void getDetails()
	{
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public static void main (String args[])
	{
		Encapsulation A = new Encapsulation();
		
		A.setName("vikram");
		A.setAge(40);
		A.getDetails();
	}

}
