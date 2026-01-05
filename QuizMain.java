import java.util.Scanner;

public class QuizMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quiz Score: ");
        int score = sc.nextInt();

        Student student = new Student(name);

        QuizResult.saveResult(student.getName(), score);
        System.out.println("Result Saved Successfully!");

        QuizResult.readResults();
    }

}