package class10;

public class E4Array2D {
    public static void main(String[] args) {
        /*
        whenever we repeat code we should replace it with a loop
         */
        int [][] matrix={
                {10, 20, 30},
                {20, 50, 65},
                {102,54,60}
        };
        for (int j=0; j<3; j++){
            int [] arr1=matrix[j];
            for (int i=0; i< arr1.length; i++){
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
        }
    }
}
