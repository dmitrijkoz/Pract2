package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {

    public static void main(String[] args) {

        // Создание обычного автомобиля
        Car car = new Car(
                "Toyota Camry",
                "A123BC",
                "Black",
                2022,
                "Иван Иванов",
                "INS-100",
                "Petrol"
        );

        // Создание электромобиля
        ElectricCar electricCar = new ElectricCar(
                "Tesla Model 3",
                "B456CD",
                "White",
                2024,
                "Петр Петров",
                "INS-200",
                75.0
        );

        // Изменение свойств Car через setters
        car.setModel("Toyota Corolla");
        car.setColor("Blue");
        car.setYear(2023);
        car.setOwnerName("Алексей Смирнов");
        car.setLicense("C777CC");
        car.setInsuranceNumber("INS-101");
        car.setEngineType("Hybrid");

        // Изменение свойств ElectricCar через setters
        electricCar.setModel("Tesla Model Y");
        electricCar.setColor("Red");
        electricCar.setYear(2025);
        electricCar.setOwnerName("Дмитрий Козловский");
        electricCar.setLicense("E888EE");
        electricCar.setInsuranceNumber("INS-201");
        electricCar.setBatteryCapacity(82.0);

        System.out.println("=== Обычный автомобиль ===");
        System.out.println(car);

        System.out.println();

        System.out.println("=== Электромобиль ===");
        System.out.println(electricCar);

        System.out.println();

        // Полиморфизм
        Vehicle vehicle1 = car;
        Vehicle vehicle2 = electricCar;

        System.out.println("=== Полиморфизм ===");

        System.out.println("vehicle1.vehicleType(): "
                + vehicle1.vehicleType());

        System.out.println("vehicle2.vehicleType(): "
                + vehicle2.vehicleType());

        System.out.println();

        System.out.println("vehicle1:");
        System.out.println(vehicle1);

        System.out.println();

        System.out.println("vehicle2:");
        System.out.println(vehicle2);
    }
}