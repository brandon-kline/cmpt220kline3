  /**
  * file: ComputeChange2.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 14, 2017
  * version: 1.0
  * 
  */
  
 /**
  * ComputeChange2
  * 
  * This class allows for the computation of
  * a given dollar amount into it's 
  * corresponding amount in dollars, quarters,
  * dimes, nickels, and pennies.
  */
  
  import java.util.Scanner;
  public class ComputeChange2 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter an amount: ");
  String amount = input.nextLine();
  String dollarnum = amount.substring
  (0, amount.indexOf('.'));
  int centnum = Integer.parseInt
  (amount.substring(amount.indexOf('.')+ 1));
  int quarternum = centnum / 25;
  centnum %= 25;
  int dimenum = centnum / 10;
  centnum %= 10;
  int nickelnum = centnum / 5;
  centnum %= 5;
  System.out.println("Your amount " +
  amount + " consists of:\n " + dollarnum + 
  " dollars\n " + quarternum + " quarters\n " +
  dimenum + " dimes\n " + nickelnum + 
  " nickels\n " + centnum + " pennies\n ");
  }
  }