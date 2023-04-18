package class10;

public class hw1Array2D {
    public static void main(String[] args) {
        /*
         Create a 2D array(shorter way) in which first array will consist of 4 names and
         second array will contain grades. Then your program should print name of the
         students that has A and B grade
         */
        String [][] studentGrades={
                {"Diana","Sara","Hash","Arezo"},
                {"A", "B", "A", "B"}
        };
        for (int i=0; i<studentGrades[0].length; i++){
            if (studentGrades[1][i].equals("A")){
                System.out.println(studentGrades[0][i]+" got an A!");
            }else if(studentGrades[1][i].equals("B")){
                System.out.println(studentGrades[0][i]+" got a B!");
            }
        }
    }
}
