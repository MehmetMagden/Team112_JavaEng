package day26_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {

        // write a method that can calculate and print sum of numbers
        sum(3,4);  // 7
        sum(3,5,7); // 15
        sum(4,5,7,9); //25

    }

    public static void sum (int a, int b){

        System.out.println(a+b);
    }

    public static void sum ( int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum (int a, int b, int c ,int d){
        System.out.println(a+b+c+d);
    }
}
