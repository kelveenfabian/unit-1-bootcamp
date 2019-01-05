<<<<<<< HEAD
package Java_Bank_Pursuit_HW_FABIAN_KELVEEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DataStructures {

    public static void main(String args[]) {
//        coolCats();
//        listCreator();
//        groupMap();
//        sortingSentences("Hello World");
//        listCreator2();
          //clumpListCreator();
    }

    //Question 1
    public static void coolCats() {
        ArrayList<Cat> cats = new ArrayList<>();

        //Cat object declaration with String name parameter.
        Cat cat1 = new Cat("1");
        Cat cat2 = new Cat("2");
        Cat cat3 = new Cat("3");
        Cat cat4 = new Cat("4");
        Cat cat5 = new Cat("5");
        //Person object declaration String name parameter.
        Person person1 = new Person("Person1");
        Person person2 = new Person("Person2");
        //Set age of cat
        cat1.setAge(5);
        cat2.setAge(4);
        cat3.setAge(3);
        cat4.setAge(2);
        cat5.setAge(1);
        //Set the favorite food of cats
        cat1.setFavoriteFood("Food1");
        cat2.setFavoriteFood("Food2");
        cat3.setFavoriteFood("Food3");
        cat4.setFavoriteFood("Food4");
        cat5.setFavoriteFood("Food5");
        //Set owners for cats
        cat1.setOwner(person1);
        cat2.setOwner(person2);
        cat3.setOwner(person1);
        cat4.setOwner(person1);
        cat5.setOwner(person2);
        //Add cats to arraylist
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        //Print out information within the array list.
        for (int i = 0; i < cats.size(); i++) {
            System.out.println("Name: " + cats.get(i).getName());
            System.out.println("Age: " + cats.get(i).getAge());
            System.out.println("Favorite Food: " + cats.get(i).getFavoriteFood());
            System.out.println("Owner name: " + cats.get(i).getOwner().getName());
            System.out.println("");
        }
    }

    public static void listCreator() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(1);
        System.out.println(mostFrequentElement(list));
    }

    //Question 2 (Only works if list is sorted)
    //Bonus Question: in an array of Strings Collections.frequency(list, String name) would tell the user how many times a sequence of characters occurs in a list. The ArrayList<> generics would have to be changed to Strings as well. The .equals would have to be heavily utilized as well.
    public static String mostFrequentElement(ArrayList<Integer> list) {
        int counter = 1;
        int maxCounter = 1;
        int number = list.get(0);
        int tempNum = number;
        Collections.sort(list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                counter++;
                tempNum = list.get(i);
            } else {
                if (counter > maxCounter) {
                    maxCounter = counter;
                    number = tempNum;
                }
                counter = 1;
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                number = tempNum;
            }

        }

        return "Most Frequent Number: " + number + " | Occurrences: " + maxCounter;

    }

    //Question 3
    public static void groupMap() {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kelveen", 23);
        map.put("John", 22);
        map.put("Evelyn", 24);

        for (String name : map.keySet()) {
            System.out.println(name + ": " + map.get(name));
        }
        System.out.println(canRentACar(map));
    }

    //Question 4
    public static boolean canRentACar(HashMap<String, Integer> map) {
        boolean canRentCar = false;

        for (String name : map.keySet()) {
            if (map.get(name) >= 25) {
                canRentCar = true;
            }
        }

        return canRentCar;
    }

    public static void listCreator2() {
        ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("bb");
        list.add("b");
        list.add("ccc");

        System.out.println(wordsWithoutList(list, 1));
    }

    //Question 5
    public static ArrayList<String> wordsWithoutList(ArrayList<String> list, int omittedLength) {
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() != omittedLength) {
                newList.add(list.get(i));
            }
        }

        return newList;
    }

    public static void clumpListCreator() {
        ArrayList<Integer> clumpList = new ArrayList<>();
        clumpList.add(2);
        clumpList.add(2);
        clumpList.add(2);
        clumpList.add(1);
        clumpList.add(2);
        clumpList.add(1);
        clumpList.add(2);
        clumpList.add(2);
        System.out.println(countClumps(clumpList));
    }

    //Question 6
    public static int countClumps(ArrayList<Integer> clumpList) {
        int counter = 0;
        boolean isClump = false;

        for (int i = 1; i < clumpList.size(); i++) {
            if (clumpList.get(i) == clumpList.get(i - 1)) {
                if (!isClump) {
                    counter++;
                    isClump = true;
                }
            } else {
                isClump = false;
            }
        }
        return counter;
    }

    //Question 7
    public static void sortingSentences(String sentence) {
        ArrayList<String> sortedSentence = new ArrayList<>();


        for (int i = 0; i < sentence.length(); i++) {
            sortedSentence.add(String.valueOf(sentence.toLowerCase().charAt(i)));
        }

        Collections.sort(sortedSentence);

        for (int j = 0; j < sortedSentence.size(); j++) {
            System.out.println(sortedSentence.get(j));
        }
    }
}

=======

public class DataStructures {

  public static void main (String args[]) {

  }
}
>>>>>>> 90267823ff88ed844cd7ac7e147b6fe3ed25d1cb
