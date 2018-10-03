package practice;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double[] arrayNums = new double[5];
		
		for(int i = 0; i < arrayNums.length; i++)
		{
			System.out.println("Enter a number >> ");
			arrayNums[i] = input.nextDouble();
		}
		
		System.out.println("The output is: ");
		
		for(int j = 4; j >= 0; j--)
		{
			System.out.println(arrayNums[j]);
		}

	}

}
