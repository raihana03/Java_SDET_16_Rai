package com.syntax.review1;

public class Variables {
    public static void main(String[] args) {

        /*
        Variables Syntax
        dataType name;
         */

        //declare a variable and initialize it
        String name= "Zak";

        System.out.println(name);
        String lastName; //declaration happens ONLY once
        lastName="Smith";  //initialize or assign the value;

        System.out.println(lastName);

        int age;
        age= 21;
        age= 22; //reassign or update

        System.out.println(age);

        String street, city, state;
        street= "123 Test";
        city= "Dream City";
        state= "Wonderful State";
        state= "Different State";

        System.out.println(state);




    }


}
