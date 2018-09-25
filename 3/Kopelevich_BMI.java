import java.util.Scanner;

public class Kopelevich_BMI {
  Scanner scan = null;
  Double weight = 0.0;
  Double height = 0.0;
  
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Double getWeight() {
    return this.weight;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Double getHeight() {
    return this.height;
  }
  
  public Double getBMI() {
   return (getWeight() * 703) / (getHeight() * getHeight());
  }
  
  public String getMessage() {
    String message = "";
    Double bmi = getBMI();
    if (bmi < 18.5){
      message = "You are underweight.";
    } else if (bmi < 25) {
      message = "You are in a healthy weight range.";
    } else {
      message = "You are overweight.";
    }
    return message;
  }

  public void printResults() {
    System.out.println("BMI " + getBMI());
    System.out.println(getMessage());
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Kopelevich_BMI bmi = new Kopelevich_BMI();
    System.out.println("What is your weight in pounds?");
    Double weight = scan.nextDouble();
    bmi.setWeight(weight);
    System.out.println("What is your height in inches?");
    Double height = scan.nextDouble();
    bmi.setHeight(height);
    bmi.getBMI();
    bmi.getMessage();
    bmi.printResults();

  }
}
