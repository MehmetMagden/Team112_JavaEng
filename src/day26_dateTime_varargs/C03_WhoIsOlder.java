package day26_dateTime_varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_WhoIsOlder {

    public static void main(String[] args) {
        // take 2 different people's birthdays then compare them to see who is older

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first person's name");
        String name1 = scan.nextLine();

        System.out.println("Please enter second person's name");
        String name2 = scan.nextLine();

        System.out.println("Please enter birthday of the first person, day, month, year ");
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

        LocalDate date1 = LocalDate.of(year,month,day);
        System.out.println(date1);

        System.out.println("Please enter birthday of the second person, day, month, year ");
         day = scan.nextInt();
         month = scan.nextInt();
         year = scan.nextInt();

        LocalDate date2 = LocalDate.of(year,month,day);
        System.out.println(date2);

        System.out.println(date2.isAfter(date1) ? "First person is older" : "Second person is older");


    }
}
