/**
 * Created by Julia on 15.07.2016
 */

/*
Write a program called StarBaseTriangle that displays a triangle with ‘n’ star base.
for example per n=5 triangle pattern should look like:
	*
	**
	***
	****
	*****
 */

public class StarBaseTriangle {

    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for(int k = 0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
