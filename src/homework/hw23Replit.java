package homework;

import java.util.Scanner;

public class hw23Replit {
    /*
    Write a for loop that will print out a series of
    numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter any number form 1 to 10");
        int x = scanner.nextInt();
        for (int i=0; i<=x; i++){
            System.out.print(i+" ");
        }
    }
}
