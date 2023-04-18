package homework;

import java.util.Scanner;

public class hw24Replit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("In:");
        int x=scanner.nextInt();

        for (int i=x; i>=0; i--){
            System.out.print(i+" ");
        }
    }
}
