package homework;

public class hw32Replit {
    public static void main(String[] args) {
        //Write a program to print values from a 2D array
        double[][] arr2D = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6},
        };
        for (double[] innerArray : arr2D) {
            // second for...each loop access each element inside the row
            for (double data : innerArray) {
                System.out.print(data+ " ");
            }
            System.out.println();
        }
    }
}
