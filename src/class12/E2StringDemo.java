package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String useName="admin";
        String password="pass123";
        /*
        write code to check the username and password if the userName and password
        are less than 8 characters this msg "signup successful" otherwise print
        "Username and password can't be more than 8 characters"
         */

        if(useName.length()<8 && password.length()<8){
            System.out.println("Signup success");
        }else {
            System.out.println("UserName and Password can't be more than 8 characters");
        }

    }
}
