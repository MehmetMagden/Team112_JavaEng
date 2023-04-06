package day39_exceptions;

public class C04_ThrowKeyword {

    public static void main(String[] args) {

        int age = 30;

        try {
            if (age <=30) {

                throw new IllegalArgumentException("Age is lower than 30");
            }else {
                System.out.println("age is higher than 30");
            }
        } catch (IllegalArgumentException e) {
            // it will print all the error message with out cousing any problem
            e.printStackTrace();
            /*
            java.lang.IllegalArgumentException: Age is lower than 30
	at day39_exceptions.C04_ThrowKeyword.main(C04_ThrowKeyword.java:12)
             */

            // it will only print the exception short message
            System.out.println(e.getMessage()); // Age is lower than 30
        }

        System.out.println("everything is working fine until now");


    }
}
