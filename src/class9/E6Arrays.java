package class9;

public class E6Arrays {
    public static void main(String[] args) {
        /*
        create and array store 10,40, 60, 45, 100 then print elements which are
        present on odd indexes
        expect outcome 50 45
         */

        int[] numbers= {10, 50, 60, 45, 100};
        for(int j=0; j<numbers.length;j++){
            if (j %2!=0){
                System.out.println(numbers[j]);
    }
}}}
