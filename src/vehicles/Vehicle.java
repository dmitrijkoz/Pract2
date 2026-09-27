package vehicles;

public abstract class Vehicle {

    // Общие поля
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;

    // Защищённое поле для наследников
    protected String engineType;

    // Конструктор
    public Vehicle(
            String model,
            String license,
            String color,
            int year,
            String ownerName,
            String insuranceNumber,
            String engineType
    ) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    // ===== model =====

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // ===== license =====

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    // ===== color =====

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // ===== year =====

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // ===== ownerName =====

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // ===== insuranceNumber =====

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    // ===== engineType =====

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    // Абстрактный метод
    public abstract String vehicleType();

    // Вывод информации об объекте
    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType() + '\'' +
                ", model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", ownerName='" + ownerName + '\'' +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}