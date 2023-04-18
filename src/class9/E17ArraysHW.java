package class9;

import javax.crypto.spec.PSource;

public class E17ArraysHW {
    public static void main(String[] args) {

        String[] animalNames = {"Monkey", "Lion", "Elephant", "Horse", "Tiger"};
        for (String animals: animalNames){
            System.out.print(animals+" ");
        }

        System.out.println();

        for(int i=0; i<animalNames.length; i++){
            System.out.print(animalNames[i] + " ");
    }
}}
