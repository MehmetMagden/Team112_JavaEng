package day22_constructers;

public class C03_NurseRunner {

    public static void main(String[] args) {

        // If we dont enter any values to variables, created object will have
        // variables from the class it is created.
        // when we assing values to object variables it will change value of the objects


        C02_Nurse nurse1 = new C02_Nurse();

        System.out.println(nurse1.name);  // not registered yet
        System.out.println(nurse1.surname);  // not registered yet
        System.out.println(nurse1.age); // 0
        System.out.println(nurse1.onVacation); // false

        nurse1.name = "Melek";
        nurse1.age = 22;

        System.out.println(nurse1.name);  // Melek
        System.out.println(nurse1.surname);  // not registered yet
        System.out.println(nurse1.age); // 22
        System.out.println(nurse1.onVacation); // false



    }







}
