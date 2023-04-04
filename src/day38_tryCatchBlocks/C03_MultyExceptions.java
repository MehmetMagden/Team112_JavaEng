package day38_tryCatchBlocks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_MultyExceptions {
    public static void main(String[] args) {

        String str = "Java is getting better everyday"; //60
        int[] arr = {3, 4, 5, 4, 3, 2, 3, 4};

        /*
        ask a number from user to print index value from arr and str of that number
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 0 or a positive whole number");

        int index = 0;

        /*
        if we use a better catcher before others, it will catch all the fish, and the rest won't be able to catch anything
         */

        try {
            index = scan.nextInt(); // InputMismatchException

            System.out.println(str.charAt(index));  // StringIndexOutOfBoundsException

            System.out.println(arr[index]); //ArrayIndexOutOfBoundsException
        } catch (InputMismatchException e) {

            System.out.println("Please enter a number");
        } catch (Exception e) {

            System.out.println("There is a general problem");
        }














        /*
         we can use Exception (the greatest fish catcher in the history) in the catch block  to catch any exception


         */

//        try {
//            index = scan.nextInt(); // InputMismatchException
//
//            System.out.println(str.charAt(index));  // StringIndexOutOfBoundsException
//
//            System.out.println(arr[index]); //ArrayIndexOutOfBoundsException
//
//        } catch (Exception e) {
//
//            System.out.println(e.getMessage());
//            /*
//            to get short version of the exception message we can use "e" object which has stored the excepoion info
//            to print the error message
//             */
//
//        }


        /*
        We can use a lot of catch blocks to catch different exceptions
         */

//        try {
//            index = scan.nextInt(); // InputMismatchException
//
//            System.out.println(str.charAt(index));  // StringIndexOutOfBoundsException
//
//            System.out.println(arr[index]); //ArrayIndexOutOfBoundsException
//
//        } catch (InputMismatchException e) {
//            System.out.println("Please enter a number");
//
//        }catch (StringIndexOutOfBoundsException e) {
//            System.out.println("Please enter a number in the border of str");
//
//        }catch (ArrayIndexOutOfBoundsException e) {
//
//            System.out.println("Please enter a number in the border of Array");
//
//        }



        /*
        we can use a try catch for each possible problem
         */


//        try {
//            index = scan.nextInt(); // InputMismatchException
//        } catch (InputMismatchException e) {
//            System.out.println("Please enter a number");
//        }
//
//        try {
//            System.out.println(str.charAt(index));  // StringIndexOutOfBoundsException
//        } catch (Exception e) {
//            System.out.println("you should enter a number in borders of str");
//        }
//
//        try {
//            System.out.println(arr[index]); //ArrayIndexOutOfBoundsException
//        } catch (Exception e) {
//            System.out.println("You should enter a number in borders of Array");
//        }


    }
}
