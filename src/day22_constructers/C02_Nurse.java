package day22_constructers;

public class C02_Nurse {

    /*
    for example if we want to keep all nurses info in a hospital program
    first we need to create a class to register all each nurse's info
    and we need to create common variables these can be changed for each one

    when a new nurse cames to the hospital
    we will create an object to register the nurse
    that object will copy all instanse variables from the class

     */

    String name = "not registered yet";
    String surname = "not registered yet";
    String phoneNumber;
    String address;
    int age;
    boolean onVacation;
    char isMarried;
    int perHourSalary;

    public int calcOfSalary (int hour){
        return hour*perHourSalary;
    }


}
