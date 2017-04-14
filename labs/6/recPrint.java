/**
  * file: recPrint.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 6
  * due date: April 18, 2017
  * version: 1.0
  * 
  */

 /**
  * recPrint
  * 
  * This class allows for the calling of the
  * recClass class and prints the width, height,
  * area, and perimeter of both rectangles.
  */

public class recPrint {
  public static void main(String[] args) {
    recClass rec1 = new recClass(4, 40);
    recClass rec2 = new recClass(3.5, 35.9);
    System.out.println("\n Rectangle 1");
    System.out.println("-------------");
    System.out.println("Width:     " 
	+	rec1.width);
    System.out.println("Height:    " 
	+ rec11.height);
    System.out.println("Area:      " 
	+ rec1.getArea());
    System.out.println("Perimeter: "
	+ rec1.getPerimeter());
    System.out.println("\n Rectangle 2");
    System.out.println("-------------");
    System.out.println("Width:     " 
	+ rec2.width);
    System.out.println("Height:    "
	+ rec2.height);
    System.out.println("Area:      " 
	+ rec2.getArea());
    System.out.println("Perimeter: "
	+ rec2.getPerimeter());
    }
  }