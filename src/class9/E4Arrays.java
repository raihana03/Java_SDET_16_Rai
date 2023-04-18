package class9;

public class E4Arrays {
    public static void main(String[] args) {
        String [] names={"Amir", "Naqi", "Marie", "Mok", "Ali"};
        System.out.println(names.length);

        for(int j=0; j<names.length;j++){
            System.out.println(names[j]+" ");
    }
        System.out.println();
        int counter=0;
        while (counter< names.length){
            System.out.print(names[counter]+ " ");
            counter++;
        }

}}
