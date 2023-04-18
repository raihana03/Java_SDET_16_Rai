package class8;

public class E3ForLoop {
    public static void main(String[] args) {
        //write a loop to add all the even numbers from 1 till 30
        int sum=0; //creating variable to hold sum
       for(int i=1; i<=10; i++){
           if(i%2==0){ //checking if a number if even
               sum=sum+i; //sum+=i; //adding all the even number to the sum variable one by one
           }
       }
        System.out.println(sum);
        }
    }

