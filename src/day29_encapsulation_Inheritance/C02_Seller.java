package day29_encapsulation_Inheritance;

public class C02_Seller {
    public static void main(String[] args) {

        // to reach non-static variable and method we created an object from the class
        C01_EncapsulationPersonel pers01 = new C01_EncapsulationPersonel();

        pers01.setSellerSoldProductIncome(100);
        pers01.setSellerSoldProductIncome(150);
        pers01.setSellerSoldProductIncome(300);

        System.out.println(pers01.getPersonelSumIncome());


    }


}
