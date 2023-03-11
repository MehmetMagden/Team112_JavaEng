package day21_ArrayLists_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        // If we want to reach all elements of a collection we can use ForEachLoop
        // we should remember that
            // 1) for each loop does not use index structure
            // 2) It does not follow the order. It may start from any element in the list

        int [] arr = {2,4,5,6,3,4,5,6,7,5,3,4,5,6,7,6,4,3,2,1,2,3,4,9};
        // print sum of all elements of this array
            // for loop

        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

        int sum2=0;

        for (int each: arr
             ) {
            sum2+=each;
        }

        System.out.println(sum2);



        // print all elements these can be divided by 3

        for (int each: arr
             ) {
            if (each%3==0){
                System.out.print(each+" ");
            }

        }



        // print how many odd number there are in the array
        int counter =0;
        for (int each: arr
             ) {
            if (each%2!=0){
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);





    }
}
