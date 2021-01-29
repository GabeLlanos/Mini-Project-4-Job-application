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

     
     
     //Added to check timeWorked, ageCheck, and expCheck

     if (timeWorked && ageCheck >= 18 && expCheck)
     {
         System.out.println("you got the job! ");
     }
     else
     {
       System.out.println("Sorry re apply next time!");
     }

    
    
    
   }
}




 

  


