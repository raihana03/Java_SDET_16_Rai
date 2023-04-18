package class9;

public class E11Arrays {
    public static void main(String[] args) {
        /*
        there are two ways creating arrays
        new int[5]=> create an array of int with size 5
         */
        int[] numbers=new int[5];
            numbers[0]=60; //store 50 on index 2
            numbers[1]=70;
            numbers[2]=80;
            numbers[3]=90;
            numbers[4]=100;
        for (int number: numbers){
            System.out.println(number);
        }
    }
}
