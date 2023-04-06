package day39_exceptions;

import java.io.IOException;

public class C02_ThrowKeyWord {

    public static void main(String[] args) throws IOException {

        System.out.println("Hello");


        /*
        By using throw keyword we can manually trigger any exception we want

         */
        throw new RuntimeException();

        //System.out.println("Hello2");
    }
}
