package class9;

public class E5Arrays {
    public static void main(String[] args) {
        /*
        write a loop that starts from 0 and it goes till the number 5
        and print only the even numbers

        [a, b, c, d, e]=> a c e
        create an array of chars, and you have to print all hte chars on even indexs
         */
    char [] chars= {'A', 'B', 'C', 'D', 'E'};
        for(int j=0; j<chars.length;j++){
            if (j %2==0){
            System.out.println(chars[j]);
    }
}}}
