/**
  * file: Driver_prj1.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Project 1
  * due date: March 28, 2017
  * version: 1.0
  * 
  */
  
 /**
  * Driver_prj1
  * 
  * This class allows for the user to enter a set
  * of vectors to be convolved and prints the 
  * convolved vectors.
  */
  
import java.util.Scanner;
public class Driver_prj1 {
  public static void main(String[] args) {
    int n;
    Scanner input = new Scanner(System.in);
    int n2 = input.nextInt();
    int n3 = input.nextInt();
    double[] vFirst = new double[n2];
    double[] vSecond = new double[n3];
    for (n = 0; n < n2; ++n) {
      vFirst[n] = input.nextDouble();
      }
    for (n = 0; n < n3; ++n) {
      vSecond[n] = input.nextDouble();
      }
    double[] vResult = Driver_prj1.convolveVectors(vFirst, vSecond);
    for (int i = 0; i < vResult.length - 1; ++i) {
      System.out.printf("%d ", Math.round(vResult[i]));
      }
    System.out.printf
	("%d\n", Math.round(vResult[vResult.length - 1]));
    }
	
 /**
  * convolveVectors
  * 
  * This class allows for the convolution of a set
  * of vectors entered by the user.
  */
	
  public static double[] convolveVectors
  (double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    for (int i = 0; i < vResult.length; ++i) {
      vResult[i] = 0.0;
      for (int j = 0; j < vSecond.length; ++j) {
        if (i - j < 0 || i - j >= vFirst.length) continue;
        double[] vCalc = vResult;
        int n = i;
        vCalc[n] = vCalc[n] + vFirst[i - j] * vSecond[j];
        }
      }
    return vResult;  
    }
  } 