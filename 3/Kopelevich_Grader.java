import java.util.Scanner;

public class Kopelevich_Grader {   
   Double score1 = 0.0;
   Double score2 = 0.0;
   Double score3 = 0.0;
   
   void setScore1(Double score) {
      this.score1 = score; 
   }
   
   Double getScore1() {
      return this.score1;
   }
   
   void setScore2(Double score) {
      this.score2 = score; 
   }
   
   Double getScore2() {
      return this.score2;
   }
   
   void setScore3(Double score) {
      this.score3 = score; 
   }
   
   Double getScore3() {
      return this.score3;
   }
   
   Double getAverage() {
      return (getScore1() + getScore2() + getScore3())/3;
   }
   
   char getGrade() {
      Double score = this.getAverage();
      if (score >= 90) {
         return 'A';
      } else if (score >= 80){
         return 'B';
      } else if (score >= 70) {
         return 'C';
      } else if (score >= 60) {
         return 'D';
      } else {
         return 'F';
      }
   }
   
   void printResults() {
      
      System.out.println("Your average is: " + this.getAverage());
      System.out.println("Your grade is: " + this.getGrade());
   }
   
   public static void main (String[] args) {
      Kopelevich_Grader grader = new Kopelevich_Grader();
      Scanner scan = new Scanner(System.in);
      System.out.println("You will be asked to enter three test scores between 0 and 100.");
      System.out.println("Enter the first test score.");
      Double score1 = scan.nextDouble();
      grader.setScore1(score1);
      System.out.println("Enter the second test score.");
      Double score2 = scan.nextDouble();
      grader.setScore2(score2);
      System.out.println("Enter the third test score.");
      Double score3 = scan.nextDouble();
      grader.setScore3(score3);
      grader.printResults();
  }
}
