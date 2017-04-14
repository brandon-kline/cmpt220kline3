/**
  * file: locArray.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 6
  * due date: April 18, 2017
  * version: 1.0
  * 
  */

/*******************************
*           locArray           *
*------------------------------*
* +row: int                    *

* +column: int                 *

* +maxValue: double            *

* +locArray(array: double[][]) *
*******************************/

/**
  * locArray
  * 
  * This class allows for the location of the
  * largest element in the array entered by the
  * user.
  */
  
public class locArray {
  int row;
  int column;
  double maxValue;
  locArray(double[][] a) {
    maxValue = a[0][0];
    row = 0;
    column = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > maxValue) {
        maxValue = a[i][j];
        row = i;
        column = j;
        }
      }
    }
  }
}