package day23_constructors;

public class C03_ConstructorCall {

    // when we want to change both variables
    public C03_ConstructorCall(int numberOfProduct, String strOfProduct){
        number= numberOfProduct;
        str= strOfProduct;
    }

    // If we want to change str
    public C03_ConstructorCall (String str){
        this.str = str;
    }

    // if I want to change only the number when i create the object
    public C03_ConstructorCall (int number){
        this.number = number;
    }

    public C03_ConstructorCall (){

    }

    int number;
    String str;

    public static void main(String[] args) {

        C03_ConstructorCall obj1 = new C03_ConstructorCall();
        System.out.println(obj1.number);
        System.out.println(obj1.str);
        obj1.number=10;
        obj1.str = "Hasan";
        System.out.println(obj1.number);
        System.out.println(obj1.str);

        C03_ConstructorCall obj2 = new C03_ConstructorCall(23);
        System.out.println(obj2.number);
        System.out.println(obj2.str);

        C03_ConstructorCall obj3 = new C03_ConstructorCall("hasan");
        System.out.println(obj3.number);
        System.out.println(obj3.str);

        C03_ConstructorCall obj4 = new C03_ConstructorCall(33,"Memet");
        System.out.println(obj4.number);
        System.out.println(obj4.str);

    }
}
