package day23_constructors;

public class C05_StaticKeyword {

    /*
    1) Static variables are stored in the class. And there will be only one value
    2) Static variables can not be stored in objects
    3) Normaly we do not need to reach a static variable by using the object'name
    but we can reach it by usint the object name

     */

    static String hospitalName = "Star Hospital";
    static String hospitalPhone = "23542345";
    static String hospitalAddress= "England";

    String perName;
    String perAddress;
    String perPhone;

    public static void main(String[] args) {

        C05_StaticKeyword pers1= new C05_StaticKeyword();
        System.out.println(pers1.perName); // null
        System.out.println(hospitalName); // Star Hospital
        System.out.println(pers1.hospitalPhone); // 23542345

        C05_StaticKeyword pers2 = new C05_StaticKeyword();

        pers2. perName = "Dogan";

        System.out.println(pers2.perName); // Dogan
        System.out.println(pers1.perName); // null

        pers1.hospitalPhone = "9999999999";
        System.out.println(pers2.hospitalPhone);  // 9999999999

    }
}
