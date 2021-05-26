package coreJava;

abstract class Bank
{
	abstract void oneYearFD();
	abstract void twoYearFD();
	
	public void m1()
	{
		System.out.println("1st method");
	}
}

class ICICI extends Bank
{
	void oneYearFD()
	{
		System.out.println("ICICI one year interest rate is 7%");
	}
	
	void twoYearFD()
	{
		System.out.println("ICICI two year interest rate is 5%");
	}
}

class HDFC extends Bank
{
	void oneYearFD()
	{
		System.out.println("HDFC one year interest rate is 8%");
	}
	
	void twoYearFD()
	{
		System.out.println("HDFC two year interest rate is 6%");
	}
}

public class AbstractionEg 
{
	public static void main (String args[])
	{
		ICICI X = new ICICI();
		HDFC Y = new HDFC();
		X.oneYearFD();
		X.twoYearFD();
		Y.oneYearFD();
		Y.twoYearFD();
		
		X.m1();
		Y.m1();
	}

}
