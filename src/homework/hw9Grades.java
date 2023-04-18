package homework;

import java.util.Scanner;

public class hw9Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is quiz score?");
        double quizScore = scanner.nextDouble();

        System.out.println("What is midterm score?");
        double midtermScore = scanner.nextDouble();

        System.out.println("What is final score?");
        double finalScore = scanner.nextDouble();

        double averageScore = ((quizScore + midtermScore + finalScore) / 3);

        if (averageScore >= 90) {
            System.out.println("You got an A!");
        } else if (averageScore >= 70 && averageScore < 90) {
            System.out.println("You got a B!");
        } else if (averageScore >= 50 && averageScore < 70) {
            System.out.println("You got a C!");
        } else if (averageScore < 50) {
            System.out.println("You got an F!");
        }
    }
}