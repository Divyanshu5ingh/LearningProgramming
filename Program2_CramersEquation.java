/*
Author : Pratiti Mankodi
Date : 04-01-2021
Program Definition :
Write a program that solves the following equation and displays the value x and y: 
1) 3.4x+50.2y=44.5 
2) 2.1x+.55y=5.9

 (Assume Cramer’s rule to solve equation 

ax+by=e                x=ed-bf/ad-bc 
cx+dy=f               y=af-ec/ad-bc ) 

File name : Program2_CramersEquation.java
*/

class Program2_CramersEquation
{
	public static void main(String[] args)
	{
		
		System.out.println("The given set of equations are:");
		System.out.println(" 1) 3.4x + 50.2y = 44.5 ");
		System.out.println(" 2) 2.1x + 0.55y = 5.9 ");

		double x=0.0,y=0.0;
		double a=3.4, b=50.2, c=2.1, d=0.55 ,e=44.5, f=5.9;

		x = ((e*d) -(b*f)) / ((a*d) - (b*c));
		y = ((a*f) - (e*c)) / ((a*d) - (b*c));

		System.out.println("According to Cramer's rule, the solution of the given equations is " );

		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
}

/*
Compilation : javac Program2_CramersEquation.java

Execution : java Program2_CramersEquation 

Output:
*/

		
		
		


		

