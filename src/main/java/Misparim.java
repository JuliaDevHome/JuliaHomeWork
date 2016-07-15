/**
 * Created by Julia on 15.07.2016
 */

/*
Write a program called Misparim which prints the numbers 1 to 20 as follows:
First row - all the numbers which are multiples of 2
Second row - all the numbers which are multiples of 3
Third row - all the numbers which are multiples of 4
 */

public class Misparim {

    public static void main(String[] args) {
        Misparim misparim = new Misparim();
        misparim.printNumbers();
    }

    public void printNumbers() {
        for (int k = 2; k <= 4; k++) {
            System.out.print(String.format("Numbers which are multiples of %s : ", k));
            for (int i = 1; i <= 20; i++) {
                if (i % k == 0) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println("");
        }
    }
}

