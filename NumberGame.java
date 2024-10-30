package task1;

import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        boolean playAgain = true;
        int roundsPlayed = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while(playAgain){
            int targetNumber = new Random().nextInt(100) + 1;
            int maxAttempts = 5;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            while(attempts < maxAttempts){
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if(guess == targetNumber){
                    System.out.println("Congratulations! You guessed the correct number!");
                    score += maxAttempts - attempts + 1;
                    guessedCorrectly = true;
                    break;
                }else if(guess < targetNumber) {
                    System.out.println("Your guess is too low.");
                }else{
                    System.out.println("Your guess is too high.");
                }
            }

            if(!guessedCorrectly){
                System.out.println("Sorry, you've used all attempts. The number was " + targetNumber + ".");
            }

            roundsPlayed++;
            System.out.println("Current Score: " + score);
            System.out.print("Do you want to play another round? (y/n): "); // y/n refers yes or no
            playAgain = scanner.next().equalsIgnoreCase("y");
        }

        System.out.println("\nThanks for playing!");
        System.out.println("Total Rounds Played: " + roundsPlayed);
        System.out.println("Final Score: " + score);
        scanner.close();
    }
}
