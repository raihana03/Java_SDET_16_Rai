package homework;

import java.util.Scanner;

public class hw7Time {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("What is the current time- using 24 hour format?");
        int time= scanner.nextInt();

        if (time>=1 && time<=11){
            System.out.println("Small");
        }else if (time >=12 && time<=15){
            System.out.println("Afternoon");
        }else if (time>=16 && time<=20){
            System.out.println("Evening");
        }else if (time>=21 && time<=24){
            System.out.println("Night");
        }else {
            System.out.println("Invalid time");
    }
    }
}
