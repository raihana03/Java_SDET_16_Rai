package class12;

public class Task1 {
    public static void main(String[] args) {
        //Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        String useName="admin";
        String password="pass123";

        if(useName.length()<8 && password.length()<8){
            System.out.println("Signup success");
        }else {
            System.out.println("UserName and Password can't be more than 8 characters");
    }

        if(useName.length()>1 && password.length()<8){
            System.out.println("Password too short");
        }else {
            System.out.println("Password sufficent");
}}}
