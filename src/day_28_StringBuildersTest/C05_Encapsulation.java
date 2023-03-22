package day_28_StringBuildersTest;

public class C05_Encapsulation {

    static private String companyName = "Star Sale";

    private int saleAmount; // we will enter the amount, but we won't be able to see the amount

    private int totalSaleAmount; // we should be able to see it but should not be able to change it


    // created a getter method by using code menu
    public static String getCompanyName() {
        return companyName;
    }

    public void setSaleAmount(int saleAmount) {
        this.saleAmount = saleAmount;
        totalSaleAmount+= saleAmount;
    }

    public int getTotalSaleAmount() {
        return totalSaleAmount;
    }
}
