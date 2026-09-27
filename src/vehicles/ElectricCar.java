package vehicles;

public class ElectricCar extends Car {

    private double batteryCapacity;

    public ElectricCar(
            String model,
            String license,
            String color,
            int year,
            String ownerName,
            String insuranceNumber,
            double batteryCapacity
    ) {
        super(
                model,
                license,
                color,
                year,
                ownerName,
                insuranceNumber,
                "Electric"
        );

        this.batteryCapacity = batteryCapacity;

        // protected-поле родительского класса
        this.engineType = "Electric";
    }

    // Getter
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    // Setter
    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }
}