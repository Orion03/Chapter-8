package exercises;

import java.util.Scanner;

public class ArrayMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] arrayIntegers = new int[10];
		int total = 0;
		double avg = 0;
		
		for(int i = 0; i < arrayIntegers.length; i++) {
			System.out.println("Enter an integer >> ");
			arrayIntegers[i] = input.nextInt();
			
			total = total + arrayIntegers[i];
		}
		
		sum(total);
		higherThanAverage(avg, total, arrayIntegers);
		reverseOrder(arrayIntegers);

	}
	
	public static void sum(int total) {
		System.out.println("Total: " + total);
	}
	
	public static void reverseOrder(int[] arrayIntegers) {
		for(int j = 9; j >= 0; j--) {
			System.out.println(arrayIntegers[j]);
		}
	}
	
	public static void higherThanAverage(double avg, int total, int[] arrayIntegers) {
		avg = total / arrayIntegers.length;
		
		for(int[] k = arrayIntegers; k > avg) {
			
		}
	}

}
