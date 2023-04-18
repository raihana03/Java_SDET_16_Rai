package class9;

public class E8Arrays {
    public static void main(String[] args) {
        //print all the numbers from 6 to 0 in reverse order
        //{'A', 'B', 'C', 'D', 'E', 'F'}
        //6 5 4 3 2 1

        char[] chars= {'A', 'B', 'C', 'D', 'E', 'F'};
        for(int j= chars.length-1; j>=0; j--){

            System.out.println(j+" "+chars[j]);
    }
}}
