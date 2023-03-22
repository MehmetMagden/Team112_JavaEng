package day_28_zEncapsulation;

import day_28_StringBuildersTest.C05_Encapsulation;

public class C06_UsageOfEncapsulation {

    public static void main(String[] args) {

        /*
        By using the method we have created in C05_Encapsulation method named getter, we can reach the data but we
        can not change it
         */
        System.out.println(C05_Encapsulation.getCompanyName());
        System.out.println(C05_Encapsulation.getCompanyName().toUpperCase());
        System.out.println(C05_Encapsulation.getCompanyName());

        C05_Encapsulation toReachSetter = new C05_Encapsulation();
        toReachSetter.setSaleAmount(100);

    }
}
