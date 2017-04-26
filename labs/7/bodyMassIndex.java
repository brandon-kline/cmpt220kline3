/**
  * file: bodyMassIndex.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 7
  * due date: April 25, 2017
  * version: 1.0
  * 
  */

/**
  * bodyMassIndex
  * 
  * This class allows for the calling of
  * both BMI classes in order to print a
  * finalized Body Mass Index.
  */

public class bodyMassIndex {
  public static void main(String[] args) {
    BMI bmi1 = new BMI("John Smith", 18, 145, 5, 10);
    System.out.println("The BMI for " + bmi1.getName() + " is "+ bmi1.getBMI() + " " + bmi1.getStatus());
    BMI bmi2 = new BMI("Jane Doe", 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    BMI bmi_Bobby = new BMI("Bob Revie", 51, 205, 6, 1);
    System.out.println("BMI FOR " + bmi_Bobby.getName() + " is " + bmi_Bobby.getBMI() + " " + bmi_Bobby.getStatus());
    }
	
/**
  * BMI
  * 
  * This class defines the measurements
  * and variables used in order to 
  * calculate Body Mass Index.
  */
  
  public static class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    private double heightFeet;
    private double heightInches;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    public static final int INCH_PER_FOOT = 12;
    public BMI(String name, int age, double weight, double feet, double inches)
    {
      this.name = name; 
      this.age = age;
      this.weight = weight;
      this.heightFeet = feet;
      this.heightInches = inches;
      this.height = feet * 12 + inches;  
    }

    public BMI(String name, int age, double weight, double height) {
      this.name = name;
      this.age = age;
      this.height = height;
      this.weight = weight;
      }
/**
  * BMI
  * 
  * This class defines the name, weight,
  * and height of an individual.
  */
  
    public BMI(String name, double weight, double height) {
      this(name, 20, weight, height);
      }

/**
  * getBMI
  * 
  * This class allows for the calculation
  * of an indivdual's Body Mass Index by
  * using the indivdual's height and weight.
  */
  
    public double getBMI() {
      double bmi = weight * KILOGRAMS_PER_POUND /
      ((height * METERS_PER_INCH) * (height *  METERS_PER_INCH));
      return Math.round(bmi * 100) / 100.0;
      }
	  
/**
  * getStatus
  * 
  * This class produces a result depending
  * on the indivdual's current weight.
  */
  
    public String getStatus() {
      double bmi = getBMI();
      if (bmi < 18.5)
      return "Underweight";
      else if (bmi < 25)
      return "Normal";
      else if (bmi < 30)
      return "Overweight";
      else
      return "Obese";
      }
/**
  * getName
  * 
  * This class retrieves the name of the 
  * individual.
  */
  
    public String getName() {
      return name;
      }
/**
  * getAge
  * 
  * This class retrieves the age of the 
  * individual.
  */
  
    public int getAge() {
      return age;
      }
	  
/**
  * getWeight
  * 
  * This class retrieves the weight of the 
  * individual.
  */
	  
    public double getWeight() {
      return weight;
      }

/**
  * getHeight
  * 
  * This class retrieves the height of the 
  * individual.
  */
  
    public double getHeight() {
      return height;
      }
    }
  }