 import java.util.Scanner;

class Main {
  public static void main(String[] args) 
   {
    Scanner scan = new Scanner(System.in);

   //This will ask the questions

    System.out.println("What is your name? ");
    String name = scan.next();
    System.out.println("Have you worked before true/false");
    boolean timeWorked = scan.nextBoolean();
    System.out.println("Was your time at work above 2 months? true/false");
    boolean expCheck = scan.nextBoolean();
    System.out.println("What is your age");
    int ageCheck = scan.nextInt(); 
    System.out.println("If you have worked, did your previous employer write a recommendation? true/false ");
    boolean recCheck = scan.nextBoolean();

     
     
     //Added to check timeWorked, ageCheck, and expCheck

     if (timeWorked && ageCheck >= 18 && expCheck)
     {
         System.out.println("you got the job! ");
     }
     else
     {
       System.out.println("Sorry re apply next time!");
     }

    
    //Put into a new method
    
   }
   static boolean doubleCheck(boolean timeWorked, int ageCheck, boolean expCheck)
   {
     boolean doubleCheck;
     return doubleCheck = timeWorked && ageCheck >= 18 && expCheck;
  
   }
}




 

  


