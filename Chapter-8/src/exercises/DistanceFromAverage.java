package exercises;

import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double[] arrayNums = new double[20];
		
		int quit = 0;
		int total = 0;
		
		while(quit != 99999)
		{
			for(int i = 0; i < arrayNums.length; i++)
			{
				System.out.println("Enter a number >> ");
				arrayNums[i] = input.nextDouble();
				quit = input.nextInt();
			}
		}
		
		

	}

}
