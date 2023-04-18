package class10;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class hw2Array2D {
    public static void main(String[] args) {
    /*
    Create 2D array of cars : american, german, korean, italian.
    Then retrieve all values from that array using 2 different loops
    */
        String[][] cars = {
                {"Ford", "Tesla"},
                {"Audi", "BMW"},
                {"Kia", "Hyundai"},
                {"Ferrari", "Maserati"},
        };
        for (int i = 0; i < cars.length; i++) {
        for (int j = 0; j < cars[i].length; j++) {
            System.out.println(cars[i][j] + " ");
        }
        System.out.println();
    }
        System.out.println("------------");
    for (String[] car:cars){
        for (String carTwo : car) {
            System.out.println(carTwo + " ");
        }
        System.out.println();
    }
}}
