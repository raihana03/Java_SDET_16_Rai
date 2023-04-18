package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please type in a number?");
        int lastNumber= scanner.nextInt();

        int count=1;
        while (count<=lastNumber){
            System.out.println(count);
            count++;
        }
    }
}
