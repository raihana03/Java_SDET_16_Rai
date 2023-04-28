package class12;

public class Task2 {
    public static void main(String[] args) {
        /*
        Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
         */
        String useName="admin";
        String password="pass123!@#";
        String confirmpassword="pass123!@#";

        if (useName.isEmpty() && password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        } else if(password.length()<8){
            System.out.println("Password is too short");
        } else if(password.equals(useName)){
            System.out.println("password cannot contain username");
        } else if(!password.equals(confirmpassword)){
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }
    }
}
