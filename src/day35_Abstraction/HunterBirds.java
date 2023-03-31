package day35_Abstraction;

public class HunterBirds extends Birds {

    public void  move(){
        System.out.println("they fly");
    }
    public  void nutrition(){
        System.out.println("eats meat");
    }

    @Override
    public void life() {
        System.out.println("life method from hunterBirs");
    }

    public  void claw(){
        System.out.println("clawed");
    }
    public  void beak(){
        System.out.println("pointed beak");
    }

    @Override
    public void isBird() {
        System.out.println("isBird method is called from hunterBird" );
    }
}
