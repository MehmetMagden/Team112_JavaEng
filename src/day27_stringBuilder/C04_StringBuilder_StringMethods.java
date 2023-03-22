package day27_stringBuilder;

public class C04_StringBuilder_StringMethods {
    public static void main(String[] args) {

        /*
        When we try to use methods from different class than StringBuilder (toString(), subString())
        atfirstStep, these methods turns StringBuilder to String data. after using that kind of methods
        we can use other StringMethods too

        Important

        When we use a method that turns our StringBuilder to String, These methods do not affect the original value of
        StringBuilder

         */

        StringBuilder sb1 = new StringBuilder("Java Life");
        StringBuilder sb2 = new StringBuilder("Java life");

        System.out.println(sb1.substring(5)); // Life
        // sb1 = sb1.substring(5);  rigth side is String, and the left side is StringBuilder so java can not
                                    // execute this code

        System.out.println(sb1);  //  Java Life

        System.out.println(sb1.compareTo(sb2));  // -32

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true


        System.out.println(sb1.subSequence(3, 6)); // a L
        System.out.println(sb1); //Java Life



    }
}
