package Java_Bank_Pursuit_HW_FABIAN_KELVEEN;

public class Conditionals {

    public static void main(String args[]) {

        System.out.println(isOdd(5));//True
        System.out.println(isOdd(2));//False

        System.out.println(isMultipleOfThree(12));//True
        System.out.println(isMultipleOfThree(5));//False

        System.out.println(isOddAndIsMultipleOfThree(9));//True
        System.out.println(isOddAndIsMultipleOfThree(5));//False

        System.out.println(isOddAndIsMultipleOfThree2(9));//True
        System.out.println(isOddAndIsMultipleOfThree2(5));//False

        fizzMultipleOfThree(9);//Output: "Fizz"
        fizzMultipleOfThree(5);//Output: 5

        Person person = new Person("Kelveen");
        person.setCity("London");
        Person person1 = new Person("John");
        person1.setCity("Brooklyn");

        System.out.println(personFromLondon(person)); //True
        System.out.println(personFromLondon(person1));//False

        personNameLongerThan5Chars(person);//True
        personNameLongerThan5Chars(person1);//False

        //This is only true if there are cigars between 40 and 60.
        System.out.println(cigarParty(45, false));//True
        System.out.println(cigarParty(85, true));//True
        System.out.println(cigarParty(30, false));//False

        System.out.println(caughtSpeeding(60, false));//0
        System.out.println(caughtSpeeding(65, false));//1
        System.out.println(caughtSpeeding(65, true));//0

        System.out.println(alarmClock(1, false));//7:00
        System.out.println(alarmClock(0, false));//10:00
        System.out.println(alarmClock(0, true));//off
        System.out.println(alarmClock(5, true));//10:00

        System.out.println(lotteryTicket(1, 1, 1));//20
        System.out.println(lotteryTicket(1, 2, 3));//0
        System.out.println(lotteryTicket(1, 1, 2));//10
        System.out.println(lotteryTicket(1, 2, 1));//10
        System.out.println(lotteryTicket(2, 1, 1));//10

        System.out.println(blackJack(19, 21));//21
        System.out.println(blackJack(21, 19));//21
        System.out.println(blackJack(19, 22));//19

        System.out.println(evenlySpace(2, 4, 6));//True
        System.out.println(evenlySpace(4, 6, 2));//True
        System.out.println(evenlySpace(4, 6, 3));//False
    }

    //Question 1
    public static boolean isOdd(int n) {
        return (n % 2 == 1) ? true : false;
    }

    //Question 2
    public static boolean isMultipleOfThree(int n) {
        return (n % 3 == 0) ? true : false;
    }

    //Question 3
    public static boolean isOddAndIsMultipleOfThree(int n) {
        return (n % 2 == 1 && n % 3 == 0) ? true : false;
    }

    //Question 4
    public static boolean isOddAndIsMultipleOfThree2(int n) {
        return (isOdd(n) && isMultipleOfThree(n)) ? true : false;
    }

    //Question 5
    public static void fizzMultipleOfThree(int n) {
        if (isMultipleOfThree(n)) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    //Question 6
    public static boolean personFromLondon(Person person) {
        if (person.getCity().equals("London")) {
            return true;
        } else {
            return false;
        }
    }

    //Question 7
    public static void personNameLongerThan5Chars(Person person) {
        if (person.getName().length() >= 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short");
        }
    }

    //Question 8
    public static boolean cigarParty(int numCigars, boolean isWeekend) {
        if (numCigars >= 40 && numCigars <= 60 && !isWeekend) {
            return true;
        } else if (numCigars >= 40 && isWeekend) {
            return true;
        } else {
            return false;
        }
    }

    //Question 9
    public static int caughtSpeeding(int speedLimit, boolean isBirthday) {
        int ticket = 0;

        if (isBirthday) {
            if (speedLimit <= 65) {
                ticket = 0;
            }
            if (speedLimit > 65 && speedLimit <= 85) {
                ticket = 1;
            }
            if (speedLimit > 85) {
                ticket = 2;
            }
        } else {
            if (speedLimit <= 60) {
                ticket = 0;
            }
            if (speedLimit > 60 && speedLimit <= 80) {
                ticket = 1;
            }
            if (speedLimit > 80) {
                ticket = 2;
            }
        }

        return ticket;
    }

    //Question 10
    public static String alarmClock(int dayOfWeek, boolean isVacation) {
        String alarmClock = null;

        if (isVacation) {
            switch (dayOfWeek) {
                case 0:
                case 6:
                    alarmClock = "off";
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    alarmClock = "10:00";
                    break;
            }
        } else {
            switch (dayOfWeek) {
                case 0:
                case 6:
                    alarmClock = "10:00";
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    alarmClock = "07:00";
                    break;

            }
        }

        return alarmClock;
    }

    //Question 11
    public static int lotteryTicket(int a, int b, int c){
        int lottery = 0;

        if(a != b && a != c && b != c){
            lottery = 0;
        }
        if(a == b && b == c){
            lottery = 20;
        }
        if(a == b && b != c || a == c && c != b || c == b && b != a){
            lottery = 10;
        }
        return lottery;
    }

    //Question 12
    public static int blackJack(int firstCard, int secondCard){
        int closerCard;

        if(firstCard > secondCard){
            if(firstCard > 21){
                closerCard = secondCard;
            }else{
                closerCard = firstCard;
            }

        }else{
            if(secondCard > 21){
                closerCard = firstCard;
            }else{
                closerCard = secondCard;
            }

        }

        return closerCard;

    }

    //Question 13
    public static boolean evenlySpace(int a, int b, int c){
        boolean isEvenlySpaced = false;

       if(a - b == b - c || a - c == c - b || a - b == c - a){
           isEvenlySpaced = true;
       }

       return  isEvenlySpaced;
    }


}
