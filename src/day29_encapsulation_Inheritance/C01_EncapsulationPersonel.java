package day29_encapsulation_Inheritance;

public class C01_EncapsulationPersonel {

     private int  personelSumIncome =0;  // personel will be able to read this amount

     private int sellerSoldProductIncome =0; // seller will be eble to enter this amount

    private  boolean holyday = true;


    // By using this getter method we can see the total amount, but we can not change it no matter what. Because it
    // does not have any setter method
     public int getPersonelSumIncome() {
        return personelSumIncome;
    }

    // By using this setter method we can enter an amount, but we can not see it. Because it does not have any getter method
     public void setSellerSoldProductIncome(int sellerSoldProductIncome) {
        sellerSoldProductIncome = sellerSoldProductIncome;
        personelSumIncome = personelSumIncome + sellerSoldProductIncome;
    }

    public boolean isHolyday() {
        return holyday;
    }

    public void setHolyday(boolean holyday) {
        this.holyday = holyday;
    }
}
