package exercises;

import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double[] arrayNums = new double[20];
		double total = 0;
		double avg = 0;
		int quit = 0;
		int i = 0;
		
		while(quit != 99999){
			System.out.println("Enter a number >> ");
			arrayNums[i] = input.nextDouble();
			
			total = total + arrayNums[i];
			
			i++;
			
			System.out.println("Enter 99999 to quit.");
			quit = input.nextInt();
		}
		
		avg = total / arrayNums.length;
		
		System.out.println("Total: " + total + "\nAverage: " + avg);
		
		}

}
