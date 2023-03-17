package day26_dateTime_varargs;

public class C10_Varargs {
    public static void main(String[] args) {

        // calculate sum of given numbers then multiply that sum by 2 and print

        multAndSum(2,3,4,5,6,7,4,3,4,5,6,7,8,9,7,5);

    }

    public static void multAndSum(int a, int... b){

        int sum =0;
        for (int each: b
             ) {
            sum +=each;

        }

        int result = sum * a;
        System.out.println(result);

    }

    /*
    varargs should be at the end of parameters, You can not add another one after varargs

    we can not use more than one varargs as parameter. If we do, we will face CTE

     */

}
