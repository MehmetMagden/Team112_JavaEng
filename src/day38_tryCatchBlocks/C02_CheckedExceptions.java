package day38_tryCatchBlocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_CheckedExceptions {

    /*
    When java can find a possible problem before executing code, it is called checked exception

    most of the time it happens when we try to write/read a file

    When we use throws keyword or try-catch block, red line will disappear

    throws keyword does not fix the problem, just we inform Java that we know it can throw an exception
    instead of using throws keyword, we should use try-catch blocks to prevent unwanted problems

    To handle an exception

        1) try- catch blocks : when we use it we can tell java what to do when the problem occurs
        2) Throw keyword : it only removes red line, that's all. we write it just after the method parameters


     */



    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "src/day38_tryCatchBlocks/texta.txt";

            FileInputStream fis = new FileInputStream(filePath);

        System.out.println("program ended");

    }




}
