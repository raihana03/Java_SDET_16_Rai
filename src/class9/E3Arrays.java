package class9;

public class E3Arrays {
    public static void main(String[] args) {

        double[] numbers={10.5, 5.5, 0.05, 100.5, 394, 129, 481, 502, 482};
       //numbers.length gives us total count of numbers/elements in array
        System.out.println(numbers.length);

        for(int j=0; j<numbers.length;j++){
            System.out.println(numbers[j]+" ");
        }
    }
}
