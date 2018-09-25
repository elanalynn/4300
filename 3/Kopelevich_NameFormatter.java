import java.util.Scanner;

public class Kopelevich_NameFormatter {
  Scanner scan = null;
  String firstName = "";
  String lastName = "";
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return this.lastName;
  }
  
  public String getFullName() {
    return (getFirstName() + " " + getLastName());
  }

  public char getFirstInitial() {
    return getFirstName().charAt(0);
  }

  public String uppercaseFullName() {
    return (getFullName()).toUpperCase();
  }

  public int getLength() {
    return getFullName().length();
  }

  public void printResults() {
    System.out.println("Full Name: " + getFullName());
    System.out.println("First Initial: " + getFirstInitial());
    System.out.println("UPPERCASE!: " + uppercaseFullName());
    System.out.println("Character Count: " + getLength());
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Kopelevich_NameFormatter nameFormatter = new Kopelevich_NameFormatter();
    System.out.println("What is your first name?");
    String firstName = scan.nextLine();
    nameFormatter.setFirstName(firstName);
    System.out.println("What is your last name?");
    String lastName = scan.nextLine();
    nameFormatter.setLastName(lastName);
    nameFormatter.printResults();
  }
}
