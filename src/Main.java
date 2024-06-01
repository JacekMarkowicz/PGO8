public class Main {
    public static void main(String[] args) {
        Car car = new Car("bmw", "asds", 2017, 30000, 600);
        Truck truck = new Truck("mercedes", "ccww", 2018, 23000, 700, 10);

        System.out.println( car.calculateFuelEfficiency());
        System.out.println( truck.calculateFuelEfficiency());
    }
}