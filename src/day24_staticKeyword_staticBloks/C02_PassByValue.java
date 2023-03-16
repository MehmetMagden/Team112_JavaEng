package day24_staticKeyword_staticBloks;

public class C02_PassByValue {
    public static void main(String[] args) {

        double price = 200;

//        int price = 100;
//        String price = "300";
        discount10(price); //180
        System.out.println("after calling discount10 method price is : "+price); // after calling the method price is : 200.0
        discount25(price);
        System.out.println("after calling discount25 method price is : "+price); // after calling the method price is : 200.0
        System.out.println("after calling the method which has a return type : " + discount10BringResult(price));
        System.out.println("Original price is : "+price);

        price=discount10BringResult(price);
        System.out.println("After the assignmnt in the main mathod, original price is : " + price);

    }

    public static void discount10 (double price){

        price = price * 0.9;
        System.out.println("price is : "+price); // price is : 180.0

    }

    public static void  discount25( double price){
        price = price*0.75;
        System.out.println("after 25% discount, price is : "+price);

    }

    public static double discount10BringResult (double price){

        price = price *0.9;

        return price;

    }


}
