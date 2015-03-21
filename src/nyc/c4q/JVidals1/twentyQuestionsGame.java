package nyc.c4q.JVidals1;

/**
 * Created by s3a on 3/20/15.
 * Janneisy Vidals
 * 2.1 Accesscode
 */

import java.util.Scanner;
import java.util.Random;

public class twentyQuestionsGame {

    public static void main(String[] args) {

//Declared variable called magicNumber, which is an int type and use the math.random method to give it random value in from 1 to 1000.

        int magicNumber;
        magicNumber = (int) (Math.random() * 999 + 1);
        Scanner input = new Scanner(System.in);
        int userGuess = 0;
        int misses = 0;

            do {
                System.out.print("Enter a guess (1-1000): ");
                userGuess = input.nextInt();
                if (userGuess == magicNumber)
                    System.out.print("Your guess is correct. Awesome job!");
                else if (userGuess < magicNumber)
                    System.out.print("Your guess is less than the magic number. ");
                else if (userGuess > magicNumber)
                    System.out.print("Your guess is greater than the magic number");

            } while (userGuess != magicNumber);

        }
    }














