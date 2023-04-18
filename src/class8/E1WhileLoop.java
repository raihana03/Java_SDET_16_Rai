package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting point, ending point and the step");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int step=scanner.nextInt();
        int number=start;
        while (number<=end){
            System.out.print(number+" ");
            number=number+step; //number+=step
        }
    }
}
