package day25_passByValue_mutable_Immutable_StringPool_DateTime;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValue {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers); //[3, 4, 5]
        increaseElements(numbers);
        System.out.println("Original list after increase elements method : "+ numbers);

         assignNewList(numbers);
        System.out.println("after assinn new list method, original numbers list : "+ numbers);

    }

    public static void increaseElements (List<Integer> number){

        // let's double each element

        for (int i = 0; i <number.size() ; i++) {
            number.set(i,number.get(i)*2);
        }

        System.out.println("in the increaseElements method Number list : "+ number);



    }

    public static void assignNewList (List<Integer> numbers){

        numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("in assignNewList method, numbers list : "+numbers);

    }




















}
