package day23_constructors;

public class C01_Car {


    /*

    When parameter's name and variable's name are not same, we can directly assign the value

    Usually, parameter's name is longer to explain what is asked but when they are same. We should add "this" keyword
    before the left side of the variable.

    if we don't write "this" before the variable, java will choose the easiest variable to
    process codes.
    */

    // when we create a constructor in a class we should also create a copy of default constructor
    public C01_Car(){

    }

    public C01_Car(int prc, String brnd){

        price = prc;
        brand = brnd;

    }

    public C01_Car(int year, String brand, String model, int price, String fuelType) {

        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;


    }

    int year=1999;
    String brand = "not defined";
    String model = "not defined";
    int price;
    String fuelType;

    public void  fuelConsumption (String fuelType){

        switch (fuelType){

            case "gasoline" :
                System.out.println("fuel consumption is 6l / 100km");
                break;

            case "diesel" :
                System.out.println("fuel consumption is 5l / 100km");
                break;

            case "electric" :
                System.out.println("fuel consumption is 4l / 100km");
                break;
            default:
                System.out.println("Please enter correct fuel type");
        }


    }

    @Override
    public String toString() {
        return "C01_Car : " +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fuelType='" + fuelType + '\''
                ;
    }
}
