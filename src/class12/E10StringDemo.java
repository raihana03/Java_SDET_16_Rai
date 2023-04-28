package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name = "LEANDRO";

        int counter = 0; //to count how many times r appears
        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == 'R'){

            counter++;
        }}
        System.out.println(counter);
    }
}
