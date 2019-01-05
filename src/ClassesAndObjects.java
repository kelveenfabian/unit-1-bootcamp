package Java_Bank_Pursuit_HW_FABIAN_KELVEEN;

import java.util.ArrayList;
import java.util.Collections;

public class ClassesAndObjects {

  public static void main (String args[]) {
    //Question 1
    Cat cat1 = new Cat("Garfield");
    Cat cat2 = new Cat("Pink Panther");
    Cat cat3 = new Cat("CatWoman");

    cat1.setFavoriteFood("Lasagna");
    cat2.setFavoriteFood("Taffy");
    cat3.setFavoriteFood("Bats");

    cat1.setAge(10);
    cat2.setAge(55);
    cat3.setAge(25);



    //Code Tests
//    System.out.println(isOlder(cat2, cat1));
//    makeBestFriends(cat1, cat2);
//    System.out.println(cat1.getFavoriteFood());
//    System.out.println(cat2.getFavoriteFood());
//    System.out.println(makeKitten(cat1, cat3).getName());
//    Person jon = new Person("Jon");
//    adoption(cat1, jon);
//    System.out.println(cat1.getOwner().getName());
//    adoption(cat3, jon);
//    System.out.println(isFree(cat1));
//    adoption(cat2, jon);
//    System.out.println(isSibling(cat1, cat2));
//    System.out.println(isSibling(cat1, cat3));


  }

  //Question 2
  public static boolean isOlder(Cat cat1, Cat cat2){
    boolean isOlder = false;

    if(cat1.getAge() > cat2.getAge()){
      isOlder = true;
    }else{
      isOlder = false;
    }

    return isOlder;
  }

  //Question 3
  public static void makeBestFriends(Cat cat1, Cat cat2){
    cat1.setFavoriteFood(cat1.getFavoriteFood() + " and " + cat2.getFavoriteFood());
    cat2.setFavoriteFood(cat1.getFavoriteFood());
  }

  //Question 4
  public static Cat makeKitten(Cat cat1, Cat cat2){
    Cat newCat = new Cat(cat1.getName()+cat2.getName());
    newCat.setAge(0);

    return newCat;
  }

  //Question 5
  public static void adoption(Cat cat, Person person){
    //Bonus Question
    if(cat.getName() == "CatWoman"){
      System.out.println("CatWoman will never be anyone's pet");
    }else{
      cat.setOwner(person);
    }
  }

  //Question 6
  public static boolean isFree(Cat cat){
    boolean isFree = false;
    try{
      if(!cat.getOwner().getName().isEmpty()){
        isFree = true;
      }
    }catch (NullPointerException e){
      isFree = false;
    }

    return isFree;
  }

  //Question 7
  public static boolean isSibling(Cat cat1, Cat cat2){
    boolean isSibling = false;

    if(cat1.getOwner() == cat2.getOwner()){
      isSibling = true;
    }

    return isSibling;
  }


}
