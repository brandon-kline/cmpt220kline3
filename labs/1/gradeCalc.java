   /**
  * file: gradeCalc.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 1
  * due date: Jaunuary 31, 2017
  * version: 1.0
  * 
  */
   
  /**
  * gradeCalc
  * 
  * This class allows for the calculation of 
  * a student's grades by adding the points
  * earned in each section and multiplying them
  * by their respective weights to create the
  * student's grade.
  */

  import java.util.Scanner;
  public class gradeCalc {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print(
  "Please enter the following as a percentage: ");
  System.out.print(
		  "\n\nMidterm Exam: ");
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
  System.out.println(
  "Your final grade is: " + sum + "%");
  }
  }