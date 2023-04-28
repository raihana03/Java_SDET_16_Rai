package homework;

import class12.Dog;

public class hw41Replit {
    public static void main(String[] args) {
/*
In this class, you should specify the following
attributes: breed, name, color, and following behaviors: bark(), run(), play()
 */
        Dog actualDog=new Dog();
        String breed1 = "Husky";
        String breed2 = "Bulldog";
        String breed3 = "Labrador";

        String attribute1= "bark";
        String attribute2= "run";
        String attribute3="play";


        System.out.println(breed1+ " can "+ attribute1);
        System.out.println(breed1+ " can "+ attribute2);
        System.out.println(breed1+ " can "+ attribute3);
        System.out.println(breed2+ " can "+ attribute1);
        System.out.println(breed2+ " can "+ attribute2);
        System.out.println(breed2+ " can "+ attribute3);
        System.out.println(breed3+ " can "+ attribute1);
        System.out.println(breed3+ " can "+ attribute2);
        System.out.println(breed3+ " can "+ attribute3);
    }
    }

