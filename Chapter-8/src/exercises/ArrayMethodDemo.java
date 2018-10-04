package exercises;

import java.util.Scanner;

public class ArrayMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] heldIntegers = new int[10];
		
		for(int i = 0; i > heldIntegers.length; i++) {
			System.out.println("Enter 10 integers >> ");
			heldIntegers[i] = input.nextInt();
		}

	}

}
