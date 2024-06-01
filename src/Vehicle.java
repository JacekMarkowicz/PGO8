abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    // Konstruktor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public abstract double calculateFuelEfficiency();

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return getYear();
    }
}