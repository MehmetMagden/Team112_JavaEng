package day20_ArrayLists;

public class C07_UsingMethodFromOtherClass {
    public static void main(String[] args) {

        // if number of dividers is higher than 10 print "beautiful" for a given number
        // if not, print "baad"

        int number =100; // the given number

        int numberOfDividers = C06_Questions.positiveDividers(number).size();  // will return us, dividers list
        System.out.println("numberOfDividers = " + numberOfDividers);

        if (numberOfDividers>10){
            System.out.println("Beautiful");
        }else {
            System.out.println("baad");
        }



    }
}
