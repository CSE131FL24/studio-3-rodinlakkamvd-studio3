package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("To what number did you want to go till?");
		int arrayLength = in.nextInt();

		boolean[] primeNumbers = new boolean[arrayLength]; 

		for(int i = 2; i < arrayLength; i++) {


			for(int j = i*2; j < arrayLength; j = j + i) {
				
				primeNumbers[j] = false; 
				primeNumbers[i] = true; 
			}		

		}
		for(int i = 0; i < arrayLength; i++) {
			if(primeNumbers[i] == true) {
			System.out.println(i);
		}
		}
		
	}
}
