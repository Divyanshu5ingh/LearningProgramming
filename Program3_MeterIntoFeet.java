/*
Author : Pratiti Mankodi
Date : 04-01-2021
Program Definition :
Write a program to read a number in meter, convert it into feet and display the result
File name : Program3_MeterIntoFeet.java
*/

import java.util.Scanner;

class Program3_MeterIntoFeet
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number in meter : ");
		
		Scanner sc = new Scanner(System.in);
		double meter = sc.nextDouble();
		//double feet = meter * 3.28;
		System.out.println("Equvialent feet value is : " + 3.28 * meter + " feet");
	}
} 

/*

Compilation : javac Program3_MeterIntoFeet.java


Execution : java Program3_MeterIntoFeet

output:

*/
