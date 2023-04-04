package day37_Interface_Exceptions;

public class C01_TryCatch {

    public static void main(String[] args) {

        /*
        When we write our codes If we can foresee a problem before it happens
        we can try-catch to offer a solution for that problem to java

        and when that occurs java will follow our instructions

         */

        int number1= 20;
        int number2 = 0;


        try {

            System.out.println(number1/number2);

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("problem : "+e.getMessage());

            System.out.println("We handled the problem. We can continue");

        }
        System.out.println("can you see me?");







    }
}
