package homework;

public class hw33Replit {
    public static void main(String[] args) {

            double[][] a = {
                    {1.4,2.0,3.3,2},
                    {4,1.5,6.1,1},
                    {1.2,3.1,4,1.6}
            };

            //Double and print array
        for(int i=0; i<a.length; i++){
            double[]b=a[i];
            for(int j=0; j<b.length; j++){

                System.out.print(b[j]*2+" ");
            }
            System.out.println();
        }
    }
}

