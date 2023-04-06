package day39_exceptions;

public class C05_FilanyInTryCatchBlocks {

    public static void main(String[] args) {

        /*
        after try-catch block if we use finally block, no mather what happened before this finally, it will be executed

         */


        try {
            System.out.println(10/2);

        } catch (Exception e) {
            System.out.println("there is a math problem here");
        } finally {
            System.out.println("finally some action");
        }

        try{
            System.out.println(5/2);
        }finally {
            System.out.println("finally");
        }


    }

}
