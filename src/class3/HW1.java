package class3;

import javax.management.MBeanAttributeInfo;

public class HW1 {
    public static void main(String[] args) {
        int myNumber= 5;
        int stepOne=(myNumber*myNumber);
        System.out.println(myNumber*myNumber);
        int stepTwo=(stepOne+myNumber);
        System.out.println(stepOne+myNumber);
        int stepThree=(stepTwo/myNumber);
        System.out.println(stepTwo/myNumber);
        int stepFour=(stepThree+17);
        System.out.println(stepThree+17);
        int stepFive=(stepFour-myNumber);
        System.out.println(stepFour-myNumber);
        int stepSix=(stepFive/6);
        System.out.println(stepFive/6);

        System.out.println("The magic number is 3!");
    }

}

