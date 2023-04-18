package homework;

import java.util.Scanner;
public class hw31Replit {
    public static void main(String[] args) {
        int [] numbers= new int[5];
        Scanner scanner= new Scanner(System.in);

        for(int i =0 ;i<numbers.length;i++) {
            numbers[i] = scanner.nextInt();
        }
                for(int j =0; j<numbers.length;j++) {
                    System.out.println(numbers[j] + "O");
                }
                System.out.println();
                }}


