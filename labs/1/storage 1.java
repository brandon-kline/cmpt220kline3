    /**
   * file: Lab_1 Prb_1.java
   * author: Brandon Kline
   * course: CMPT 220
   * assignment: Lab 1
   * due date: Jaunuary 31, 2017
   * version: 1.0
   * 
   * This file contains the declaration of the 
   * SinglyLinkedList abstract data type.
   */
   
    /**
   * word
   * 
   * This class allows for a larger version of the text
   * "JAVA" to be printed using word art when the
   * program is run.
   */

  

public class word {
	public static void main(String[] args) {
		  System.out.println("     J     A     V     V     A");
		  System.out.println("     J    A A     V   V     A A");
		  System.out.println("J    J   AAAAA     V V     AAAAA");
		  System.out.println(" J J    A     A     V     A     A"); 
		  }
		  

}

    /**
   * file: Lab_1 Prb_2.java
   * author: Brandon Kline
   * course: CMPT 220
   * assignment: Lab 1
   * due date: Jaunuary 31, 2017
   * version: 1.0
   * 
   * This file contains the declaration of the 
   * SinglyLinkedList abstract data type.
   */
   
    /**
   * thermometer
   * 
   * This class allows for the conversion of a number in
   * degrees Celsius into degrees Fahrenheit and printed when the
   * program is run.
   */

import java.util.Scanner;
public class thermometer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = 9.0 / 5 * celsius + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit
			+ " Fahrenheit"); 
	}
}

    /**
   * file: Lab_1 Prb_3.java
   * author: Brandon Kline
   * course: CMPT 220
   * assignment: Lab 1
   * due date: Jaunuary 31, 2017
   * version: 1.0
   * 
   * This file contains the declaration of the 
   * SinglyLinkedList abstract data type.
   */
   
    /**
   * gratuityCalc
   * 
   * This class allows for the calculation of the gratuity rate
   * and total of a bill and is and printed when the
   * program is run.
   */


import java.util.Scanner;
public class gratuityCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;
		System.out.println("The gratutity is $" + gratuity + " and total is $" + total);
	}
}

    /**
   * file: Lab_1 Prb_4.java
   * author: Brandon Kline
   * course: CMPT 220
   * assignment: Lab 1
   * due date: Jaunuary 31, 2017
   * version: 1.0
   * 
   * This file contains the declaration of the 
   * SinglyLinkedList abstract data type.
   */
   
    /**
   * digitCalc
   * 
   * This class allows for the addition of digits of a number,
   * which are then totaled and printed when the
   * program is run.
   */

import java.util.Scanner;
public class digitCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int lessThan10 = number % 10;
		number /= 10;
		int tens = number % 10;
		number /= 10;
		int hundreds = number % 10;
		number /= 10;
		int sum = hundreds + tens + lessThan10;	
		System.out.println("The sum of the digits is " + sum);
	}
}