/**
  * file: CountAvg.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 3
  * due date: Febuary 21, 2017
  * version: 1.0
  * 
  */
  
 /**
  * CountAvg
  * 
  * This class allows for an string of integers 
  * to be entered and positives and negatives to
  * be grouped and counted and the average of the 
  * numbers to be taken.
  */
  
import java.util.Scanner
public class CountAvg {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pos = 0;
    int neg = 0;
    int all = 0;
    double total = 0;
    System.out.print("Enter an integer, 
	the input ends if it is 0: ");
    int num = input.nextInt();
    if (num == 0) {	
	  System.out.print("No numbers are entered 
	  except 0");
	  }
    while (num != 0) {
      if (num > 0) pos++;
      else neg++;
      total += num;
      all++;
      num = input.nextInt();
      }
    double avg = total / all;
    System.out.println("The number of positives is "
	+ pos + "\nThenumber of negatives is " + neg +
	"\nThe total is " + total + "\nThe average is " + avg);
    }
  }