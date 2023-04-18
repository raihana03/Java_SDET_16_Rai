package homework;

import java.util.Scanner;

public class hw8Month {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your birth month using numbers only? Ex- 1= January, 2= February");
        int month= scanner.nextInt();

        if (month==1 || month==2 || month==12 ){
            System.out.println("You were born is season Winter");
        }else if (month ==3 || month==4 ||month<=5){
            System.out.println("You were born is season Spring");
        }else if (month==6 || month==7 || month==8){
            System.out.println("You were born is season Summer");
        }else if (month==9 || month==10 || month==11) {
            System.out.println("You were born is season Fall");
        }else {
            System.out.println("Invalid month");
    }

    }
}
