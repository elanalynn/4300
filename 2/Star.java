public class Star {

    public static void main(String[] args) {
      Star.starLoop();
    }
    
    public static void starLoop() {
      int i = 0;
      while(i < 5){
         for (int j = 0; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
         i = i + 2 ;
      }
      while(i >= 0){
         for (int j = 0; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println("");
         i = i - 2;
      }
    }
}
