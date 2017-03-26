    /**
  * file: lottery.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 7, 2017
  * version: 1.0
  * 
  */
  
 /**
  * lottery
  * 
  * This class allows for the user to input a
  * a 3 digit number which is then matched with 
  * another random 3 digit number. If the user's
  * digits or number matches, the user wins money.
  */
  
  import java.util.Scanner;
  public class lottery {
  public static void main(String[] args) {
  int lottery = (int)(Math.random() * 1000);
  Scanner input = new Scanner(System.in);
  System.out.print
  ("Enter a three digit number: ");
  int numpick = input.nextInt();
  int lotterynum1 = lottery / 100;
  int lotterynum2 = lottery % 100  / 10;
  int lotterynum3 = lottery % 10;
  int guessnum1 = numpick / 100;
  int guessnum2 = numpick % 100 / 10;
  int guessnum3 = numpick % 10;
  System.out.println
  ("The lottery number is " + lottery); 
  if (numpick == lottery)
    System.out.println("Exact match: you win $10,000");
  else if (guessnum2 == lotterynum1  && guessnum1 
      == lotterynum2 && guessnum3 == lotterynum3
      || guessnum1 == lotterynum1 && guessnum3
      == lotterynum2 && guessnum2 == lotterynum3
      || guessnum3 == lotterynum1 && guessnum1 
      == lotterynum2 && guessnum2 == lotterynum3
      || guessnum2 == lotterynum1 && guessnum3 
      == lotterynum2 && guessnum1 == lotterynum3 
      || guessnum3 == lotterynum1 && guessnum2
      == lotterynum2 && guessnum1 == lotterynum3)
    System.out.println("All digits match: you win $3,000");
  else if (guessnum1 == lotterynum1 || guessnum1 == lotterynum2 
      || guessnum1 == lotterynum3 || guessnum2 == lotterynum1 
      || guessnum2 == lotterynum2 || guessnum2 == lotterynum3
      || guessnum3 == lotterynum1 || guessnum3 == lotterynum2 
      || guessnum3 == lotterynum3)
    System.out.printl(("One digit match: you win $1,000");
  else
    System.out.println("Sorry, no match");	  
  }
}
