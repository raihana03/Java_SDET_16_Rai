package class7;

public class E11WhileLoop {
    public static void main(String[] args) {
        int number = 100;
        while (number > 0) {
            System.out.print(number + " ");
            number--;
        }

        //assigning a new value to the counter for next loop
        int even = 20;
        System.out.println();
        while (even <= 100) {
            System.out.print(even + " ");
            even += 2;
        }

        int odd = 100;
        System.out.println();
        while (odd >= 1) {
            if (odd % 2==1) {
                System.out.print(odd+ " ");
            }
            odd--;
        }
    }}