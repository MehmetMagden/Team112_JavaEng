package day38_tryCatchBlocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_ParentChildException {
    public static void main(String[] args) {

        String filePath = "src/day38_tryCatchBlocks/text.txt";  // address of my file

        /*
        first we should try to catch the exception by using specific catchers, still if we can not,
         we should use a general exception cather
        */


        try {

            FileInputStream fis = new FileInputStream(filePath);  // we are trying to do something with the file

        } catch (FileNotFoundException e) {     // If java can not find the file

            System.out.println("Java could not be able to find the file");
        } catch (Exception e){

            System.out.println("there is a problem");
        }



    }


}
