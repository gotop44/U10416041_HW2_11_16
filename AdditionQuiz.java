/** U10416041 */

import java.util.Scanner;
import java.util.ArrayList;

public class AdditionQuiz {
	
	/** Main method */
	public static void main(String[] args) {
		
		/** Create a Scanner and a ArrayList */
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> userAnswer = new ArrayList<Integer>();
		
		/** Create a question */
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		System.out.print("What is " + number1 + " + " + number2 + " ? ");
		int answer = input.nextInt();
		
		/** Check the answer */
		while (number1 + number2 != answer) {
			/** Alert the user if the answer is entered again */
			if (userAnswer.contains(answer)) {
				System.out.println("You already answered " + answer);
			}
			
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + " ? ");
			userAnswer.add(answer);
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");
	}
}