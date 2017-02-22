/**
  * file: Driver_lab3.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 3
  * due date: Febuary 21, 2017
  * version: 1.0
  * 
  */
  
 /**
  * Driver_lab3
  * 
  * This class allows for the entering of the
  * variables and creates new strings.
  */
  
import java.util.Scanner;
public class Driver_lab3 {
  public static void main(String[] args) {
    double x1 = 0;
    double y1 = 0;
    double x2 = 0;
    double y2 = 0;
    double p = 0;
    String input;
    Scanner st = new Scanner(System.in);
    while(st.hasNextDouble()) {
i      nput = st.nextLine();
      Scanner sc = new Scanner(input);
      if(input.equals("0"))
    break;
    else {
      x1 = sc.nextDouble();
      y1 = sc.nextDouble();
      x2 = sc.nextDouble();
      y2 = sc.nextDouble();
      p = sc.nextDouble();
      System.out.println(calculate_p_norm
	  (x1, y1, x2, y2, p));
    }				
  }
}
 /**
  * calculate_p_norm
  * 
  * This class allows for the calculation of the 
  * p-norm within the file.
  */
static double calculate_p_norm
(double x1, double y1, double x2, double y2, double p) {
  double x, y, answer;
  x = java.lang.Math.abs(x2 - x1);
  x = java.lang.Math.pow(x, p);
  y = java.lang.Math.abs(y1 - y2); 
  y = java.lang.Math.pow(y, p);
  answer = x + y ;
  answer = java.lang.Math.pow(answer, (1/p));
return answer;
}
}