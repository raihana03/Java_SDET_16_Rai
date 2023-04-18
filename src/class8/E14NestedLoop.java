package class8;

import java.security.spec.RSAOtherPrimeInfo;

public class E14NestedLoop {
    public static void main(String[] args) {
        /*
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
         */
        //COMPLEX SOLUTION
        for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i+1 + " ");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+2 + " ");
    }
        System.out.println();

//SIMPLER OPTION BELOW:
        for(int j=0; j<3; j++){
            for (int i=1; i<=5; i++){
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
}}