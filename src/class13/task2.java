package class13;

public class task2 {
    public static void main(String[] args) {
        //create a String that should be combination of letters, numbers and special characters.
        //find out how many alphanumeric characters there are in the string.

        String str="fksmnfie2490i23NIDOMR@!%$#";
        str=str.replaceAll("[!-*]", "");
        System.out.println(str.length());

        System.out.println("-----------");

        String str1="fksmnfie2490i23NIDOMR@!%$#";
        str=str1.replaceAll("[^a-zA-Z]", "");
        System.out.println(str1);
        System.out.println(str1.length());

    }
}
