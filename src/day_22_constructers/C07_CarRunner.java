package day_22_constructers;

public class C07_CarRunner {

    public static void main(String[] args) {

        C06_Car car1 = new C06_Car(); // at first we used default constructor, if we do not create a copy of deafult
                                        //constructor, we can not create any object

        car1.brand= "Toyota";
        car1.model= "Corolla";
        car1.year = 2017;
        car1.price = 5203;

        System.out.println("Brand : "+car1.brand+", model : "+car1.model+", year : "+ car1.year+", price"+ car1.price);

        C06_Car car2 = new C06_Car("Mercedes");
        System.out.println("Brand : "+car2.brand+", model : "+car2.model+", year : "+ car2.year+", price"+ car2.price);

        C06_Car car3 = new C06_Car(2010,"Honda","Jazz",3000);
        System.out.println(car3);

        //car3.fuelConsumption("diesel");
        System.out.println("==========================");
        C06_Car car4 = new C06_Car(2022,"Honda","Corolla",6000,"diesel");




    }




}
