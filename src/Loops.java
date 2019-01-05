package Java_Bank_Pursuit_HW_FABIAN_KELVEEN;

public class Loops {

    public static void main(String args[]) {
        //printNumbers();
        //printNumbers2();
        //printNumbers3(100);
        //printEvenNumbers(100);
        //printSumOfNumbers();

        //Question 7
        //printSumOfNumbers2(10000);
        //printStringNTimes(0, "hello");
        //printStringNTimes2(5, "hello");
        //fibonnaciSequence3(15);
        //System.out.println(notReplace("This is a problem"));
        //System.out.println(wordEnds("XY1XY", "1"));//output: c13i
       //numPuzzle();
       // numPuzzle2();

    }

    //Question 1
    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    //Question 2
    public static void printNumbers2() {
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }

    //Question 3
    public static void printNumbers3(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    //Question 4
    public static void printEvenNumbers(int n) {
        for (int i = 2; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }

    //Question 5
    public static void printSumOfNumbers() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    //Question 6
    public static void printSumOfNumbers2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    //Question 8
    public static void printStringNTimes(int n, String s) {
        if (n < 0) {
            System.out.println("");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(s);
            }
        }
    }

    //Question 9
    public static void printStringNTimes2(int n, String s) {
        if (n < 0) {
            System.out.println("");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(s + s);
            }
        }
    }

    //Question 10
    public static void fibonnaciSequence() {
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < 7; i++) {
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }

    //Question 11
    public static void fibonnaciSequence2() {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + num1;
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        System.out.println(sum);
    }
    //Question 12

    public static void fibonnaciSequence3(int n) {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + num1;
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        System.out.println(sum);
    }

    //Question 13 (HAD A PROBLEM WITH THIS ONE)
    public static void sumNumbers(String s) {
        int num1 = 0;
        String number = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                number = number + s.charAt(i);
            } else {
                if (!number.equals("")) {
                    num1 = num1 + Integer.parseInt(number);
                    number = "";
                }
            }
        }
        System.out.println(num1);
    }

    //Question 14 (HAD A PROBLEM WITH THIS ONE)
    public static String notReplace(String s) {
        return s.replaceAll("is", "is not");
    }

    //Question 15
    public static String wordEnds(String s, String nonS) {
        String newString = "";

        if (s.contains(nonS)) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == nonS.charAt(0) && i != 0) {
                    newString = newString + s.charAt(i - 1);
                }
                if (s.charAt(i) == nonS.charAt(nonS.length() - 1) && i != s.length()-1) {
                    newString = newString + s.charAt(i + 1);
                }
            }
        } else {
            System.out.println("The string " + nonS +
                    " does not exist in string " +
                    s + ". Please try again");
        }

        return newString;
    }

    //Question 16
    public static void numPuzzle(){
        int num1 = 0;
        int num2 = 0;

        for(int i = 10; i < 100; i++){
            for(int j = 10; j < 100; j++){
                if(i + j == 60 && i - j == 14){
                    num1 = i;
                    num2 = j;
                    System.out.println(num1 + " + " + num2 + " = " + " 60 " + " AND " + num1 + " - " + num2 + " = " + " 14 ");
                }
            }
        }
    }

    //Question 17
    public static void numPuzzle2(){
        int num1 = 0;
        int num2 = 0;

        for(int i = 1; i < 10; i++){
            for(int j = 0; j < 10; j++){
                num1 = i;
                num2 = j;
                System.out.println(i + "" + j + ", " + num1 + "+" + num2 + " = " + (i + j));
            }
        }
    }

}
