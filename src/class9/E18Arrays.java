package class9;

public class E18Arrays {
    public static void main(String[] args) {
        int [] num= {1,4, 12, 53,121};
        int sum=0;
        for (int i=0; i< num.length;i++){
            sum=sum+num[i];
        }
        System.out.println(sum);

        System.out.println();
        int [] numbers= {1,4, 12, 53,121};
        int max=numbers[0];
        for (int i=0;i< numbers.length;i++){
            if (num[i]>max)
                max=num[i];
        }
        System.out.println(max);
    }
}
