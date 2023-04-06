package day39_exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {

//NullPointerException
        // when we try to use a null variable with a method, it will couse NullPointerException
        String str = null ;

        System.out.println(str); // null
        System.out.println(str + "abc");  // nullabc

//        System.out.println(str.concat("abc")); // NullPointerException


// StringIndexOutOfBoundsException

        String str2 = "Java";
//        System.out.println(str2.charAt(10)); // StringIndexOutOfBoundsException: String index out of range: 10


//ArrayIndexOutOfBoundsException:
        int [] arr = {3,5,7,5,3};
     //   System.out.println(arr[10]);  //ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5


//NumberFormatException
        String str4 ="3";
        //String str5 ="4k"; //NumberFormatException: For input string: "4k"
        //Please calculate sum of numbers

        //int sum = Integer.parseInt(str4) + Integer.parseInt(str5);
        //System.out.println(sum); //7


        int number1 = 3435;

        Object obj = number1;

        String numberStr = (String) obj;

        //String numberStr = number1;

        System.out.println(numberStr); // ClassCastException:





    }


}
