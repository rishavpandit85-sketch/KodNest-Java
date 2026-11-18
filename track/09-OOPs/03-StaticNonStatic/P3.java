
class Car {

    static void convertKmIntoMiles() {
        System.out.println("Converting KM into Miles..");
    }

    void calculateMilage() {
        System.out.println("Calculating Milage.....");
    }
}

public class P3 {

    public static void main(String[] args) {

        Car.convertKmIntoMiles();

        Car nano = new Car();
        nano.calculateMilage();

        Car bmw = new Car();
        bmw.calculateMilage();
    }
}
