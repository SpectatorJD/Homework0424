public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla",8);
        Car car2 = new Car("VAZ",5);
        car.setModelName("car1");
        car2.setModelName("car2");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);
        car.check();
        car2.check();

        Truck truck = new Truck("KAMAZ", 8);
        Truck truck2 = new Truck("VOLVO", 16);

        truck.setModelName("truck1");
        truck2.setModelName("truck2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);
        truck.check();
        truck2.check();

        Bicycle bicycle = new Bicycle("BMX", 4);
        Bicycle bicycle2 = new Bicycle("KAMA",3);
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);
        bicycle.check();
        bicycle2.check();
    }
}