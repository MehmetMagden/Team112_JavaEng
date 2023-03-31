package day35_Abstraction;

public abstract class Birds extends Animal {

    public void  wing(){
        System.out.println("they are winged");
    }
    public void  respiration(){
        System.out.println("they breathe with lungs");
    }
    public void  beak(){
        System.out.println("they have beaks");
    }
    public void  multiply(){
        System.out.println("they multiply with eggs");
    }

    public abstract void isBird();

}
