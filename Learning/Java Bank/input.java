import java.util.Scanner;
public class input {
    static double monStart(){
        Scanner obj = new Scanner(System.in);
    System.out.println("Hello user! How much money do you currently have in you account?");
    double getCurrent = obj.nextDouble();

    if (getCurrent > 0 || 1 > getCurrent){
        System.out.println("Alright!");
       } else {
        getCurrent = 0.0;
       }
    return getCurrent;
    }
   static double withdrawalAmt() {
    Scanner obj = new Scanner(System.in);
         System.out.println("Hello user! How much money do you want to withdrawl?");
         double withdrawl = obj.nextDouble();
         obj.close();
         if (withdrawl > 0 || 1 > withdrawl) {
            System.out.println("Withdrawing...");
         }else {
            System.out.println("Error, try again");
            withdrawl = 0.0;
         }
         return withdrawl;
         }
     }