package day40_GarbageCollecter_FinalFinalyFinalisze;

public class C01_Final_Finaly_Finalize {

    public static void main(String[] args) {

        // Final Keyword
        System.out.println(Integer.MIN_VALUE);  // final variables are named with capitals
        //Integer.MIN_VALUE=-3; //we can not change a final variable

        System.out.println(Math.PI);  // 3.141592653589793


        // Finally
        try {
            System.out.println(10 / 0);

        } catch (Exception e) {

            throw new RuntimeException(e);

        } finally {     // no mather what happens in try-catch blocks, finally block will be executed

        }


        // finalize: It is a method to mark unused objects in the memory. then garbage collector comes and destroys
        //these marked objects. It is an automatic process handled by JVM
        // We can call finalize(), but we do not need to call it.


    }

}
