package day14_methodOverloading_whileLoop;

public class C03_MethodOverloading {

    public static void main(String[] args) {

        String str ="Java is everything";

        System.out.println(str.substring(5)); // for same method name we can create different functions by inceasing
        System.out.println(str.substring(5, 8)); // number of arguments

        System.out.println(str.replace('a', 'o'));  // for same method name we can create different functions by
        System.out.println(str.replace("is", "are")); // changing the data type


    }
}
