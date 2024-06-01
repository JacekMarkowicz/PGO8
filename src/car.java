class Car extends Vehicle {
    private double milesDriven;
    private double fuelConsumed;

    // Konstruktor
    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    // Implementacja metody calculateFuelEfficiency
    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / fuelConsumed;
    }
}
