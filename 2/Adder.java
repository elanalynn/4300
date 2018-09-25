public class Adder {

    public static void main(String[] args) {
      Adder.total();
    }
    
    public static void total() {
      int a = 62;
      int b = 99;
      int total = a + b;
      
      System.out.print(String.format("%d + %d = %d", a, b, total));
    }
}
