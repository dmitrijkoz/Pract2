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

        this.engineType = "Electric";
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }
    @Override
    public String toString() {
        return super.toString()
                + ", batteryCapacity=" + batteryCapacity + " кВт·ч";
    }
}