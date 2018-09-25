import java.util.Scanner;
import java.text.DecimalFormat;

public class Register {
   Scanner scan = null;
   double price = 0.0;
   int quantity = 0;
   double taxRate = 7.5;
   
   public Register() {
      scan = new Scanner(System.in);
   }
   
   public void setPrice(Double price) {
      this.price = price;
   }
   
   public double getPrice() {
      return this.price;
   }
   
   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }
   
   public int getQuantity() {
      return this.quantity;
   }
   
   public void startTransaction() {
      System.out.println("Purchase some doodads!");
      this.promptForPrice();
   }
   
   public void promptForPrice() {
      System.out.println("Please enter a price for each unit.");
      double price = scan.nextDouble();
      this.setPrice(price);
      this.promptForQuantity();
   }
   
   public void promptForQuantity() {
      System.out.println("Please enter the quantity needed.");
      int quantity = scan.nextInt();
      this.setQuantity(quantity);
      scan.close();
      this.printResults();
   }
   
   public double getSubtotal() {
      return price * quantity;
   }
   
   public double getTax() {
      return getSubtotal() * this.taxRate/100;
   }
   
   public double getTotal() {
      return getSubtotal() + getTax();
   }
   
   public void printResults() {
      DecimalFormat f = new DecimalFormat("##.00");
      String stringPrice = f.format(getPrice());
      String stringSubtotal = f.format(getSubtotal());
      String stringTax = f.format(getTax());
      String stringTotal = f.format(getTotal());
      System.out.println("Doodad Receipt");
      System.out.println("**************");
      System.out.println(String.format("Unit Price: $%s", stringPrice));
      System.out.println(String.format("Quantity: %d", this.quantity));
      System.out.println(String.format("Subtotal: $%s", stringSubtotal));
      System.out.println(String.format("Tax: $%s", stringTax));
      System.out.println(String.format("Total: $%s", stringTotal));
   }
   
   public static void main (String[] args) {
      Register register = new Register();
      register.startTransaction();
   }
}
