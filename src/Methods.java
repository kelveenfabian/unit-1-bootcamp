package Java_Bank_Pursuit_HW_FABIAN_KELVEEN;

import java.util.Random;

public class Methods {

  public static void main (String args[]) {
//    System.out.println(calculateSquare(3));//9
//    System.out.println(calculateSquareRoot(9));//3
//    System.out.println(toLowerCase("Hello World! How are you doing?"));
//    System.out.println(isMultiple(5, 5));
//    prettyInteger(100);
    //System.out.println(random(6, 1));

  }
  //Question 1
  public static int calculateSquare(int num){
    return num * num;
  }

  //Question 2
  public static int calculateSquareRoot(int num){
    return (int) Math.sqrt(num);
  }

  //Question 3
  public static String toLowerCase(String words){
    return words.toLowerCase();
  }

  //Question 4
  public static boolean isMultiple(int num1, int num2){
    boolean isMultiple = false;

    if(num2 % num1 == 0){
      isMultiple = true;
    }else{
      isMultiple = false;
    }

    return isMultiple;
  }

  //Question 5
  public static void prettyInteger(int number){
    String prettyInteger = "";
    for(int i = 0; i < number; i++){
     prettyInteger += "*";
    }

    prettyInteger = prettyInteger + " " + number + " ";

    for(int i = 0; i < number; i++){
      prettyInteger += "*";
    }

    System.out.println(prettyInteger);
  }

  //Question 6
  public static int random(int num1, int num2){
    Random random = new Random();
    int randomNum;

    if(num1 < num2){
      randomNum = random.nextInt((num2-num1)+1) + num1;
    }else{
      randomNum = random.nextInt((num1-num2)+1) + num2;
    }

    return randomNum;
  }

}
