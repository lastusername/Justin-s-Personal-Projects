import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    System.out.println("Hello user! what is your name?");
    Scanner nObj = new Scanner(System.in);
    String fName = nObj.nextLine();
    System.out.println("Nice to meet you " + fName);

    int max = 0;
    System.out.println("Please insert your maximum value");
    boolean correct = true;
    while (correct){
      try {
        Scanner scanMax = new Scanner(System.in);
        max = scanMax.nextInt();
        System.out.println(max + " is your Maximum Variable");
        correct = false;
      } catch (Exception e) {
        System.out.println("you did not enter a Valid Integer, please try again");
        correct = true;
      }
    }

    int min = 0;
    System.out.println("Please insert your Minimum value");
    boolean correct2 = true;
    while (correct2){
      try {
        Scanner scanMin = new Scanner(System.in);
        min = scanMin.nextInt();
        if (min < max) {
          correct2 = false;
          System.out.println(min + " is your Minimum Variable");
        }  else if (min >= max){
          System.out.println("you did not enter a smaller integer, please try again");
          correct2 = true;
        }
      } catch (Exception e) {
        System.out.println("you did not enter a Valid Integer, please try again");
        correct2 = true;
      }
  }
    System.out.println("now lets play guess the number, what number will you use?");
     int va = 0;
  boolean correct3 = true;
  int randomN = (int)(Math.random()* (max - min+1))+min;
    while (correct3){
      try { 
        Scanner scanV = new Scanner(System.in);
        va = scanV.nextInt();
        System.out.println(va + " is your Variable");
        if (va <= max && va >= min) {
          System.out.println(va + " is a valid Variable");
         if (randomN == va){
    System.out.print("you got it");
            correct3 = false;
    } else if (va < randomN){
      System.out.println(va +" is less than the number, please try again");
    } else if (va > randomN){
      System.out.println(va+ " is more than the number, please try again");
    }
        }else if (va > max || va < min){
          System.out.println("you did not enter an integer inbetween "+min+"-"+max+", please try again");
          correct3 = true;
      } 
      }catch (Exception e) {
        System.out.println("you did not enter a Valid Integer, please try again");
        correct3 = true;
      }
    }
}
}