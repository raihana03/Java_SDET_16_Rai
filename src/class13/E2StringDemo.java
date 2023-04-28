package class13;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="jfIOJENwjioj3490r";
        System.out.println(str.replaceAll("[a-z]", "*"));
        System.out.println(str.replaceAll("[A-Z]", "#"));
        System.out.println(str.replaceAll("[0-9]", "%"));
        //System.out.println(str.replaceAll("[a-z0-9]", "$"));
        System.out.println(str.replaceAll("[#-z]", "*"));

        char c='A';
        c++;
        System.out.println(c);
        System.out.println("----------------");
        for (int i=0; i<10; i++){
            System.out.println(c++);
        }
    }
}
