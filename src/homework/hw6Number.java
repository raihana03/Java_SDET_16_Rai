package homework;

import java.util.Scanner;

public class hw6Number {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Type a a number 1-1000?");
        int number= scanner.nextInt();

        if (number>=1 && number<=10){
            System.out.println("Small");
        }else if (number >=11 && number<=100){
            System.out.println("Medium");
        }else if (number>=101 && number<=1000){
            System.out.println("Large");
        }else {
            System.out.println("Invalid number");
        }
    }
}
