  /**
  * file: letterGrade.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 7, 2017
  * version: 2.0
  * 
  */
  
 /**
  * gradeCalc
  * 
  * This class allows for the calculation of 
  * a student's grades by adding the points
  * earned in each section and multiplying them
  * by their respective weights to create the
  * student's grade. It then converts the grade
  * percentage to a letter grade and prints it.
  */
  
  import java.util.Scanner;
  public class letterGrade {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println(
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
  double sum = (midtermExam*0.2) + (finalExam*0.2)
  + (projects*0.2) + (homework*0.4);
  if (sum >= 100)
  System.out.println(
  "Your final grade is: A"); 
  else if (sum >= 95)
  System.out.println(
  "Your final grade is: A-");
  else if (sum >= 90)
  System.out.println(
  "Your final grade is: B+");
  else if (sum >= 87)
  System.out.println(
  "Your final grade is: B");
  else if (sum >= 83)
  System.out.println(
  "Your final grade is: B-");
  else if (sum >= 80)
  System.out.println(
  "Your final grade is: C+");
  else if (sum >= 77)
  System.out.println(
  "Your final grade is: C");
  else if (sum >= 73)
  System.out.println(
  "Your final grade is: C-");
  else if (sum >= 70)
  System.out.println(
  "Your final grade is: D+");
  else if (sum >= 65)
  System.out.println(
  "Your final grade is: D");
  else
  System.out.println(
  "Your final grade is: F");
  }
  }