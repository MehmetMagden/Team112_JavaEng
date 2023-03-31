package day35_Abstraction;

public class FastBirds extends Birds{
    @Override
    public void move() {
        System.out.println("they fly fast");
    }

    @Override
    public void nutrition() {
        System.out.println("they eat everything");
    }

    @Override
    public void life() {
        System.out.println("they can live forever");
    }

    @Override
    public void isBird() {
        System.out.println("we are not sure");
    }

    public static void main(String[] args) {

    }
}
