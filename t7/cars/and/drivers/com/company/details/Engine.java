package oop.tasks.t7.cars.and.drivers.com.company.details;

public class Engine {
    private String manufacturer;
    private double power;

    public Engine(String manufacturer, double power) throws IncorrectEnginePowerException {
        this.setManufacturer(manufacturer);
        this.setPower(power);
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPower(double power) throws IncorrectEnginePowerException {
        if (power < 0) {
            throw new IncorrectEnginePowerException();
        } else {
            this.power = power;
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPower() {
        return power;
    }

    public String getEngineInfo() {
        return "Производитель двигателя: " + getManufacturer() + ", мощность: " + getPower() + ".";
    }
}
