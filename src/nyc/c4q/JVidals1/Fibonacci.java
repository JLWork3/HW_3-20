package nyc.c4q.JVidals1;

/**
 * Created by s3a on 3/20/15.
 * Janneisy Vidals
 * 2.1 Accesscode
 */

import  java.util.Scanner;


public class Fibonacci {

    // Fibonacci

    public static long fibonacci(long number) {

        long fibaNum1 = 1;
        long fibaNum2 = 1;
        long result = 1;

        if (number < 1) {

            System.out.println("Invalid!Enter an integer greater than one,please");
            return 0;
        }

        if (number == 1 || number == 2) {

            return 1;
        }

        for (int i = 3; i <= number; i++) {
            // result is equal to the two previous numbers
            result = fibaNum1 + fibaNum2;

            fibaNum1 = fibaNum2;
            fibaNum2 = result;
        }
        return result;
    }

    //Using a mathematical formula
    public static long fibonacciMethod (long number) {

        double fibaNum1 = Math.pow(((1 + Math.sqrt(5)) / 2.0), number);
        double fibaNum2 = Math.pow(((1 - Math.sqrt(5)) / 2.0), number);

        double result = fibaNum1 + fibaNum2 / Math.sqrt(5);
        long finalResult = (long) result;

        return finalResult;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci Calc");
        System.out.println("Enter an integer greater than 1: ");

        int inputNumber = input.nextInt();
        //long finalResult = (int)inputNum;


        System.out.println("Result: " + fibonacciMethod(inputNumber));

        // Printing Fibonacci Numbers
        //declared variables with long because the values will increase
        long  a = 0;
        long  b = 1;
        long c;

        System.out.print(a);
        System.out.print(b);
        for(int i =0; i <= 50; i ++ ){
            c= (a + b);
            a= b;
            b= c;
            System.out.print( c + " ");
        }
    }

}