package com.syntax.review2;

public class AnotherNestedIF {
    public static void main(String[] args) {

        /*
        if you have a vaccine or not
         */

        boolean vaccine= true;
        int dose= 1;

        if(vaccine){
            if(dose==1){
                System.out.println("you need second dose");
            }else if (dose==2){
                System.out.println("you are fully vaccinated");
            }else if(dose==3){
        }System.out.println("you are fully vaccinated with booster");
    }
}}
