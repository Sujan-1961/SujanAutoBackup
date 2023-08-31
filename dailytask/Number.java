package dailytask;
import java.util.Random;
import java.util.Scanner;
public class Number {
	    public static void main(String[] args) {
	        int lowerBound = 1;
	        int upperBound = 100;
	        int numberToGuess;
	        int playerGuess;
	        int attempts = 0;

	        // Generate a random number within the specified range
	        Random random = new Random();
	        numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound);

	        while (true) {
	            System.out.print("Enter your guess: ");
	            playerGuess = scanner.nextInt();
	            attempts++;

	            if (playerGuess == numberToGuess) {
	                System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
	                break;
	            } else if (playerGuess < numberToGuess) {
	                System.out.println("Try a higher number.");
	            } else {
	                System.out.println("Try a lower number.");
	            }
	        }

	        scanner.close();
	    }
	}


