package day45_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_CollectionsQuestion {
    public static void main(String[] args) {

        // Create 2 lists by taking values from user and store them in these list. Than compare them

        // print the result like this:
        // List1 : ....
        // List2 : ...
        // common elements :

        System.out.println("Let's create first list");

        // to store what method returns we should create a list
        List<String> list1=createListFromUser();

        System.out.println("Let's create second list");
        List<String> list2 = createListFromUser();

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        // to receive common elements we used retailAll method
        list1.retainAll(list2);
        System.out.println("Common elements : ");
        System.out.println(list1);


    }


    // we are planing to create 2 lists so we will be writing same codes twice.
    // to prevent this we have created a method to create a list

    public static List<String> createListFromUser (){
        // as long as user does not enter 0 system will continue asking a new value to add to the list

        // created an ampty list for the names user enters
        List<String> nameList = new LinkedList<>();

        Scanner scan = new Scanner(System.in);
        String name ="";

        // as long as user does not enter "0" loop will continue
        while (!name.equalsIgnoreCase("0")){

            System.out.println("Please enter a name for the list. To finish entering press 0");
            name = scan.next();

            // if user did not enter "0" it will be saved to list
            if (!name.equalsIgnoreCase("0")){

                nameList.add(name);
            }

        }
        return nameList;
    }

}
