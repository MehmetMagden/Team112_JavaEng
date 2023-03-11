package day_22_constructers;

import java.util.Scanner;

public class C04_Doctor {

    /*
    When we create a class, default constructor will be created automaticly. It will be invisible
    and the name of this invisible constructor is Default constructor.

    It does not have any parameters or body

    if we could see the default constructor, it would be like below

    C04_Doctor() {

    }

    If we use this default constructor, the created object will copy variables and methods from the class witout changing
    anything.

    If we want to change something in abject when we are creating it, we can change the constructor itself to make
    that change

    */

    // Even if we create an exact copy of default constructor, It won't be the default constructor. Default constructor
    // will be deleted from the class



    // ***************IMPORTANT *******************
    // when we create a constructor java will delete default constructor

    // even we can not see any constructor in the class, there is a default constructor there.

    // when we create a constructor the name of the constructor should be same with the class itself
    // A constructor can not have a return type.

    C04_Doctor() {
        System.out.println("The constructor without any parameters has executed");
    }


    String name = "not assgined";
    String surname ;
    String phone ;
    int age;
    int perHourSalary=20;

    public int calcOfSalary (int hour){
        return hour*perHourSalary;
    }



}
