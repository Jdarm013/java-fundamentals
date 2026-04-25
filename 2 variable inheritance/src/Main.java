class Vehicle {
    private String manufacturer;
    private int year;

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    // Getters
    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// Car is the child class, inheriting from Vehicle
class Car extends Vehicle {
    private String modelName;

    public Car(String manufacturer, int year, String modelName) {
        super(manufacturer, year);
        this.modelName = modelName;
    }

    // Getter for modelName
    public String getModelName() {
        return modelName;
    }

    // Setter for modelName
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDetails() {
        return "Manufacturer: " + getManufacturer() +
                ", Year: " + getYear() +
                ", Model: " + modelName;
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Ford", 2007, "Focus");

        System.out.println("--- Original Car ---");
        System.out.println(myCar.getDetails());

        // Test Setters (using inherited and specific methods)
        myCar.setManufacturer("Nissan");
        myCar.setYear(2008);
        myCar.setModelName("350z");

        System.out.println("\n--- Reset Car ---");
        System.out.println(myCar.getDetails());
    }
}