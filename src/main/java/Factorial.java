/**
 * Created by Julia on 15.07.2016
 */

/*
    By using for loop write a program called Factorial which calculates n! and prints the result.
 */

public class Factorial {

    public static void main(String [] args) {
        int number = 7;
        System.out.println(String.format("%s! = %s", number, countFactorial(number)));
    }

    public static int countFactorial(int number) {
        int factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial*= i;
        }
        return  factorial;
    }
}
