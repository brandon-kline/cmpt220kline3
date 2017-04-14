/**
  * file: recClass.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 6
  * due date: April 18, 2017
  * version: 1.0
  * 
  */

/**************************************************
*                   RecClass                     *  
* -----------------------------------------------*  
* width: double                                  *

* height: double                                 * 

* Rectangle()                                    *  

* Rectangle(newWidth: double, newHeight: double) *

* getArea(): double                              *

* getPerimeter(): double                         *
**************************************************/ 

 /**
  * recClass
  * 
  * This class allows for the creation of two
  * rectangle objects and defines their width,
  * height, area, and perimeter.
  */
  
public class recClass {
  double width;
  double height;
  recClass() {
    width = 1;
    height = 1;
    } 
  recClass (double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
    }
  double getArea() {
    return width * height; 
    }
  double getPerimeter() {
    return 2 * (width + height);
    }
  }