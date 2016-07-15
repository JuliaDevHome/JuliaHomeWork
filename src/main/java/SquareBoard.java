/**
 * Created by Julia on 15.07.2016
 */


/*
Write a program called SquareBoard that displays the following n×n (n=5) pattern using two nested for loops.
Your program should use only two output statements,one EACH of the followings:
System.out.print("# "); // print # and a space, without newline
System.out.println(); // print a newline

Output should look like:
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
 */
public class SquareBoard {

    public static void main(String[] args) {
        printSquareBoard(5);
    }

    public static void printSquareBoard(int n) {
        for (int i = 0; i < n; i++) {
            for(int k = 0; k < n; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
