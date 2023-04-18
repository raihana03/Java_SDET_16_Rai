package homework;

public class hw13Numbers {
    public static void main(String[] args) {
        int number= 20;
        while (number<=50){
            if(number%2==1){
                System.out.print(number+" ");
            }
            number++;
        }
        System.out.println();
        for (number=20; number<=50; number++){
            if(number%2==1){
                System.out.print(number+" ");
            }
        }
    }
}
