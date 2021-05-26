package coreJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UnhandledException 
{
	public static void main (String args[]) throws Exception
	{
		String x, y;
		
		BufferedReader Z = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter 2 values:");
		
		x = Z.readLine();
		y = Z.readLine();
		
		System.out.println(x+y);
	}

}
