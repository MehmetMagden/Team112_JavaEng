package day25_passByValue_mutable_Immutable_StringPool_DateTime;

public class C05_StringPool {
    public static void main(String[] args) {

        String str1 = "Java";       // Java
        String str2 = "Java";       // Java
        String str3 = new String("Java");
        String str4 = "Ja" + "va";   // Java
        String s = "Ja";
        String t = "va";
        String str5 = s.concat(t);  // Java

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true

        System.out.println("==================");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str5); // false


        /*
        When we use == symbols, java will check referance and the value at the same time
        if both of them are same, the result will be true

        Java created String pool to save a little memory. When we create a String variable
        by using normal way, java checks the pool at first. IF there is a same value there
        instead of creating a new object, java will use same object and referance for new
        variable.

        So when we use == symbols, if the value is same but the referance is different, result
        will be false.


         */

    }

}
