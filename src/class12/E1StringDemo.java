package class12;

public class E1StringDemo {
    public static void main(String[] args) {
        //create the object of that class
        //ClassName objectName=new ClassName();
        String string=new String("Rai"); //original
        String string1="Rai"; //shortcut (most widely used)
        System.out.println(string1.length());//there are 3 letters in Rai

        String name= " Axel";

        if(name.length()>8){// if name is greater than 8
            System.out.println("Only 8 characters are allowed");
        }

    }
}
