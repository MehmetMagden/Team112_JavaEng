package day38_tryCatchBlocks;

public class C01_TryCatch {

    public static void main(String[] args) {


        int numb1 = 20;
        int numb2 = 0;


        try {

            System.out.println("test0");
            System.out.println(numb1/numb2);  // Exception
            System.out.println("Test1");
            System.out.println("Test2");
            System.out.println("Test3");


        } catch (Exception e) {

            System.out.println(" you can not use zero for the second number");
        }

        /*

        When an exception occurs in try catch blocks the rest of the code will be ignored

        Java will directly jump to the catch block

        If no exceptions occurs, codes will be executed without any problem and we won't be able to see
        " you can not use zero for the second number" message

         */

    }
}
