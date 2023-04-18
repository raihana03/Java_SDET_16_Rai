package com.syntax.review4;

public class ArrayReview {
    public static void main(String[] args) {
        int j=10;
        int[] arr=new int[3];
        // we store elements based on indexes
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;//access also by indexes
        for (int a:arr){
            System.out.println(a);
        }

        System.out.println();


        String[] planets={"Earth", "Mars", "Jupiter", "Saturn", "Neptune"};

        System.out.println("Enhance for loop");
        //enhanced for loop is used ONLY with arrays and collections
        for (String planet : planets){
            System.out.print(planet);
        }


      //  System.out.println(planets[0]);
      //  System.out.println(planets[1]);
      //  System.out.println(planets[2]);
        for (int i=0; i<planets.length; i++){
            System.out.println(planets[i]);
        }
    }
}
