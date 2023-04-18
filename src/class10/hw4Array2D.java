package class10;

public class hw4Array2D {
    public static void main(String[] args) {
        /*
         Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
         Print the sum of all numbers.
         */

        int [][] numbers={
                {10, 20, 30},
                {20, 50, 65},
                {102,54,60}
    };
        int sum=0;
        for(int i=0; i< numbers.length; i++){
            for (int j=0; j< numbers.length; j++){
                sum=sum+numbers[i][j];
            }
        }
        System.out.println("Total" +" = "+ sum);
    }
}
