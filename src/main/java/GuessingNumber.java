import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        //declaration of random number from 0 to 99
        int numberToGuess = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets play the game! Guess the number from 0 to 99");

        //The for loop for 5 chances
        for(int i = 5; i > 0; i--){
            int number = scanner.nextInt();

            if (number > numberToGuess){
                System.out.println("Your number is GREATER than the one you are trying to guess");
            } else if (number < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess");
            } else if (number == numberToGuess) {
                System.out.println("You guessed it!");
                break;
            }
            System.out.println("Number of remaining guesses: " + (i-1));
            //If this is not your last chance then write out the text
            while (i > 1){
                System.out.println("Please try again");
                break;
            }
            //If you have failed to guess within five attempts
            if(i == 1 && number != numberToGuess){
                System.out.println("Sorry you didn't guess the number, the answer was:" + numberToGuess);
            }
        }
    }
}
