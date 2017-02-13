/**
  * file: GuessBirthday2.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 14, 2017
  * version: 1.0
  * 
  */
  
 /**
  * GuessBirthday2
  * 
  * This class allows for the calculation of 
  * the day of the month in which the user was
  * born by asking the user whenther or not
  * their birth date fits into one of five groups.
  */
  
  import java.util.Scanner;
  public class GuessBirthday2 {
  public static void main (String [] args) {
  String group1 = " 1  3  5  7\n" +
  " 9 11 13 15\n" + "17 19 21 23\n" +
  "25 27 39 31";
  String group2 = " 2  3  6  7\n" + 
  "10 11 14 15\n" + "18 19 22 23\n" + 
  "26 27 30 31";
  String group3 = " 4  5  6  7\n" +
  "12 13 14 25\n" + "20 21 22 23\n" + 
  "28 29 30 31";
  String group4 = " 8  9 10 11\n" +
  "12 13 14 15\n" + "24 25 26 27\n" +
  "28 29 30 31";
  String group5 = "16 17 18 19\n" + 
  "20 21 22 23\n" + "24 25 26 27\n" +
  "28 29 30 31";
  int day = 0;
  Scanner input = new Scanner(System.in); 
  System.out.print
  ("Is your birthday in Group 1?\n");
  System.out.print(group1);
  System.out.print
  ("\nEnter N for No and Y for Yes: ");
  String YesNo = input.nextLine();
  char answer = YesNo.charAt(0);
  if (Character.toUpperCase(answer) == 'Y')
  day += 1;
  System.out.print
  ("\nIs your birthday in Group 2?\n");
  System.out.print(group2);
  System.out.print
  ("\nEnter N for No and Y for Yes: ");
  YesNo = input.nextLine();
  answer = YesNo.charAt(0);
  if (Character.toUpperCase(answer) == 'Y')
  day += 2; 
  System.out.print
  ("\nIs your birthday in Group 3?\n");
  System.out.print(group3);
  System.out.print
  ("\nEnter N for No and Y for Yes: ");
  YesNo = input.nextLine();
  answer = YesNo.charAt(0);
  if (Character.toUpperCase(answer) == 'Y')
  day += 4; 
  System.out.print
  ("\nIs your birthday in Group 4?\n");
  System.out.print(group4);
  System.out.print
  ("\nEnter N for No and Y for Yes: ");
  YesNo = input.nextLine();
  answer = YesNo.charAt(0);
  if (Character.toUpperCase(answer) == 'Y')
  day += 8; 
  System.out.print
  ("\nIs your birthday in Group 5?\n");
  System.out.print(group5);
  System.out.print
  ("\nEnter N for No and Y for Yes: ");
  YesNo = input.nextLine();
  answer = YesNo.charAt(0);
  if (Character.toUpperCase(answer) == 'Y')
  day += 16; 
  System.out.println
  ("\nYour birthday is " + day + "!"); 
  }
  }