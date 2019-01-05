<<<<<<< HEAD
package Java_Bank_Pursuit_HW_FABIAN_KELVEEN;

import java.util.ArrayList;
import java.util.Collections;

public class Variables {



  public static void main (String args[]) {

    //Question 1
    int var1 = 113;
    double var2 = 2.71828;
    String var3 = "Computer Science";

    System.out.print("This is room # ");
    System.out.println(var1);

    System.out.print("e is close to ");
    System.out.println(var2);

    System.out.print("I am learning a bit about ");
    System.out.println(var3);


    //Method Tests
    System.out.println(isOdd(3));//True
    System.out.println(isOdd(2));//False

    printHelloWorld();

    System.out.println(greatestCommonFactor(1, 15));
  }

  //Question 2
  public static boolean isOdd(int number){
    if(number % 2 == 1){
      return true;
    }
    else{
      return false;
    }
  }

  //Question 3
  public static void printHelloWorld(){
    System.out.println("HelloWorld");
  }

  //Question 4
  public static int greatestCommonFactor(int num1, int num2){
    ArrayList<Integer> commonNumbers = new ArrayList<>();

    if(num1 > num2){
      for(int i = 1; i <= num1;i++){
        if(num1 % i == 0 && num2 % i == 0){
          commonNumbers.add(i);
        }
      }
    }else{
      for(int i = 1; i <= num2; i++){
        if(num1 % i == 0 && num2 % i == 0){
          commonNumbers.add(i);
        }
      }
    }

    if(commonNumbers.isEmpty()){
      return 0;
    }
    else{
      return commonNumbers.get(commonNumbers.size()-1);
    }
  }


=======

public class Variables {

  public static void main (String args[]) {

  }
>>>>>>> 90267823ff88ed844cd7ac7e147b6fe3ed25d1cb
}
