package day35_Abstraction;

public class TestClass {


}

abstract class Car{
    public abstract String model();
}

abstract class Toyota extends Car{
    public abstract void motor();

}

abstract class Corolla extends Toyota {
    public String model() {
        return "Corolla";
    }
}

class DiezelCorolla extends Corolla{

    public static void main(String[] args) {
        DiezelCorolla car1 = new DiezelCorolla();

        car1.motor(); // Diezel Corolla
        System.out.println(car1.model());  // Corolla
    }

    public void motor() {
        System.out.println(" Diezel Corolla");
    }
}
