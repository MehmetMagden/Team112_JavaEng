package day21_ArrayLists_forEachLoop;

public class C04_SumOfSquares {
    public static void main(String[] args) {
        //Question 2- Create a method that takes the squares of each element in the given int array
        // and prints the sum of its squares.

        int [] arr = {3,5,2,3,1};

        sumOfSquares(arr);


    }


    public static void sumOfSquares (int[] arr){

        int sum =0;

        for (int each: arr
             ) {
            sum= sum+ each*each;
        }
        System.out.println(sum);
    }
}
