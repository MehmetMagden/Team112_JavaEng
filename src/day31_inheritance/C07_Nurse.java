package day31_inheritance;

public class C07_Nurse extends C06_Accounting{

    String title = "Nurse";

    public void standartSalary (){
        System.out.println("Nurse will take  10 000");
    }

    public void insurance(){
        System.out.println("Nurse will have an insurance");
    }

    public static void main(String[] args) {

        C07_Nurse nurse1 = new C07_Nurse();
        nurse1.method();

    }

    public void method(){

        System.out.println(title);  // Nurse
        System.out.println(this.title);  //Nurse
        System.out.println(super.title);  // not entered

        this.standartSalary(); // Nurse will take  10 000
        super.standartSalary(); // Personel standart salary : 8500

        this.insurance(); // Nurse will have an insurance
        super.insurance(); // Insurance

        /*

        this keyword calls a variable or method from the class itself
        when we use super keyword before a variable name or method name, it will call from parents

        we can use this and super keyword as mane times as we want

         */

    }
}
