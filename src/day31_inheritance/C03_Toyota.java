package day31_inheritance;

public class C03_Toyota extends C02_Car {

    protected String toyotaStr ="toyota";

    protected C03_Toyota (){
        super(4,6,7);
        System.out.println("toyota constructor without parameters is executed");
    }

    protected C03_Toyota (int number){
        System.out.println("toyota constructor with an int parameter is executed");
    }

    protected C03_Toyota (String str){
        System.out.println("toyota constructor with a String parameter is executed");
    }

/*





 */



}
