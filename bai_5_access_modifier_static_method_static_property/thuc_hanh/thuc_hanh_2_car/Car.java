package bai_5_access_modifier_static_method_static_property.thuc_hanh.thuc_hanh_2_car;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return this.name;
    }

    public String getEngine() {
        return this.engine;
    }

    public String setName() {

    }

    public String setEngine() {
    }
}
