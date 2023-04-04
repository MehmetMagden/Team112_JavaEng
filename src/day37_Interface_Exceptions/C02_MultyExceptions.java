package day37_Interface_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_MultyExceptions {
    public static void main(String[] args) {

        /*
        calculate sum of numbers user entered
        When user presses Q, end the loop
        and calculate sum of the numbers user entered

        and if user enters something else different than Q,q and numbers
        inform user that is not possible
         */
        Scanner scan = new Scanner(System.in);

        int enteredNumber =0;
        int sum =0;
        int counter =0;

        do {

            try {

                System.out.println("Please enter a number to calculate, To end aplication plese press Q");
                enteredNumber = scan.nextInt();
                sum +=enteredNumber;
                counter++; // to count how many numbers user entered

            } catch (InputMismatchException e) {

               char input = scan.next().charAt(0);

               if (input=='q' || input== 'Q'){
                   System.out.println("Sum of "+counter+" numbers you entered is : " + sum);
                   break; // to break the do-while loop and continue the code we used "break"
               }else {
                   System.out.println("Please enter a number or to finish press Q");
               }
            }
            // to create an infinite loop we used "true" as a condition
        } while (true);

        System.out.println("we did it");


    }
}
