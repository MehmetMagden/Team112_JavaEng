package day22_constructers;

public class C05_DoctorRunners {
    public static void main(String[] args) {

        /*
        when we create an object first it will check if there is
        a class named like it

        Then it will check if there is a proper constructor to execute
        ** and without checking the codes inside of the constructor
        java will create the object first
        then it will execute the codes inside the constructor
        then ofcourse it will return the class where we created the object to
        continue code from there.
         */

        C04_Doctor doctor1 = new C04_Doctor();

        doctor1.name = "Ali";
        doctor1.age = 40;



    }






}
