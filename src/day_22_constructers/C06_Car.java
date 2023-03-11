package day_22_constructers;

public class C06_Car {

    @Override
    public String toString() {
        return "C06_Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    // when we created a new constructor, java deleted default one
    C06_Car (String brnd){
        brand = brnd;
    }

    // we should create a copy of default constructor because somebody else

    // default constructor is invisible and it does not have any parameters and a body. When we create any constructor
    // java will delete the default constructor. And someby else may had used that default constructor. If somebdy else
    // in the project had used that default constructor. This action will cause an error for their codes. To prevent that
    // problem we should create a copy of default constructor.
    public C06_Car (){

    }

    C06_Car (int yr, String brnd, String mdl, int prc) {
        year = yr;
        brand=brnd;
        model = mdl;
        price=prc;

    }

    C06_Car (int yra, String brnd, String mdl, int prc, String fType){

        year = yra;
        brand = brnd;
        model = mdl;
        price = prc;
        fuelType =fType;
        fuelConsumption(fType);

    }

    int year;
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

}
