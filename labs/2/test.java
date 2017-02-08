  import java.util.Scanner;
  public class Java1 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print(
  "Please enter the following as a percentage: ");
  System.out.print(
		  "Midterm Exam: ");
  int midtermExam = input.nextInt();
  System.out.print(
		  "Final Exam: ");
  int finalExam = input.nextInt();
  System.out.print(
		  "Projects: ");
  int projects = input.nextInt();
  System.out.print(
		  "Homework and Labs: ");
  int homework = input.nextInt();
  System.out.println(
  "Your final grade is:" + midtermExam ++ finalExam ++ projects ++ homework);
  }
  }