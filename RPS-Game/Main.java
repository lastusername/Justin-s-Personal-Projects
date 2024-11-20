import java.util.Scanner;
public class Main {
  static void greetings() {
    System.out.println("Hello Player, what is you're name");
    Scanner obj = new Scanner(System.in);
    String Fname = obj.nextLine();
    System.out.println("Hello " + Fname + "! Welcome to the program");
  }
  static String Botchoice() {
    int randomN = (int) (Math.random() * 3) + 1;
    if (randomN == 1) {
      String botChoice = "Rock";
      return botChoice;
    } else if (randomN == 2) {
      String botChoice = "Paper";
      return botChoice;
    } else {
      String botChoice = "Scissors";
      return botChoice;
    }
  }
    static String userChoice(){
     System.out.println("Please enter your choice of rock, paper, or scissors");
     Boolean Correct = true;
     while (Correct) {
         System.out.println("What will you use? R/P/S");
         Scanner scannerproceeds = new Scanner(System.in);
         String proceed = scannerproceeds.nextLine();
         if (proceed.equalsIgnoreCase("R") || proceed.equalsIgnoreCase("Rock")) {
           System.out.println("You chose Rock");
           String Userinp = "Rock";
           Correct = false;
           return Userinp;
         } else if (proceed.equalsIgnoreCase("P") || proceed.equalsIgnoreCase("Paper")) {
           System.out.println("You chose Paper");
           String Userinp = "Paper";
            Correct = false;
           return Userinp;
         } else if (proceed.equalsIgnoreCase("S") || proceed.equalsIgnoreCase("Scissors")
             || proceed.equalsIgnoreCase("scissor")) {
           System.out.println("You chose Scissor");
           String Userinp = "Scissors";
           Correct = false;
           return Userinp;
         } else {
           System.out.println("Invalid input, please try again");
           Correct = true;
         }
       }
      return "" ;
   }

   public static void main(String[] args) {

    greetings();
    String botdec = Botchoice();
    System.out.println("We will be playing the game rock, paper, scissors.");
    String Uinp = userChoice();
   
    
    if (Uinp.equals("Rock") && botdec.equals("Paper")) {
      System.out.println("You: Rock");
      System.out.println("Me: Paper");
      System.out.println("I win!");
    }
    else if (Uinp.equals("Scissors") && botdec.equals("Paper")){
      System.out.println("You: Scissors");
      System.out.println("Me: Paper");
      System.out.println("I win");
    }
      else if (Uinp.equals("Paper") && botdec.equals("Scissors")){
        System.out.println("You: Paper");
        System.out.println("Me: Scissors");
        System.out.println("I win");
      }
    else if (Uinp.equals("Rock") && botdec.equals("Scissors")) {
      System.out.println("you: Rock");
      System.out.println("Me: Scissors");
      System.out.println("You win!");
  }
    else if (Uinp.equals("Paper") && botdec.equals("Rock")) {
      System.out.println("you: Paper");
      System.out.println("Me: Rock");
      System.out.println("You win!");
    }
      else if (Uinp.equals("Scissors") && botdec.equals("Paper")) {
        System.out.println("you: Scissors");
        System.out.println("Me: Paper");
        System.out.println("You win!");
      }
    else if (Uinp.equals(botdec))
    {
      System.out.println("you: "+Uinp);
      System.out.println("Me: "+botdec);
      System.out.println("Its a tie");
    }
    else if (Uinp.equals(" "))
    {
      System.out.println("error");
    }
    }
  }