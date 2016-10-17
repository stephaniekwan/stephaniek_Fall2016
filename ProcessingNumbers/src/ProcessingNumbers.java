/* Programmer 1: Stephanie Kwan
 * Programmer 2: Robert Huang
 * October 2, 2016
 */

import java.util.*;
public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many numbers do you want to input? ");
		int terms = userInput.nextInt();
		int sumOfEvenNum = 0;
		System.out.print("Next number? ");
		int min = userInput.nextInt();
		int max = min;
		int largestEvenNum = 0;
		for(int i = 1; i < terms; i++){
			System.out.print("Next number? ");
			int nextNumber = userInput.nextInt();
			if(nextNumber < min){
				min = nextNumber;
			}
			if(nextNumber > max){
				max = nextNumber;
			}
			if(nextNumber%2 == 0){
				sumOfEvenNum += nextNumber;
				if(nextNumber > largestEvenNum){
					largestEvenNum = nextNumber;
				}
			}
		}
		System.out.println("Smallest of all numbers inputed was "+ min);
		System.out.println("Largest of all numbers inputed was "+max);
		System.out.println("The sum of all even numbers inputed was "+ sumOfEvenNum);
		System.out.println("The largest even number inputed was "+ largestEvenNum);
		
	}

}
