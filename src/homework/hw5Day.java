package homework;

import java.util.Scanner;

public class hw5Day {
    public static void main(String[] args) {
    /* Write a program that will print whether it is a weekend or weekday.
    If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output
    “It is a weekend”, any other day → output “Invalid day”
    */
        Scanner scanner= new Scanner(System.in);
        System.out.println("What day is it today? Enter a number from 1-7");
        int day= scanner.nextInt();

        if (day>=1 && day<=5){
            System.out.println("Its a weekday");
        }else if (day >5 && day<=7){
            System.out.println("Its a weekend");
        }else {
            System.out.println("Invalid day");
        }

    }
}
