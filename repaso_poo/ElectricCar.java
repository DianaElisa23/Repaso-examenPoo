
public class ElectricCar extends Vehicle implements Rechargeable {
    private double batteryCapacity;
    private double efficiency;
    private int batteryLevel;


    public ElectricCar(String brand, String model, int year, double batteryCapacity, double efficiency, int batteryLevel) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
        this.efficiency = efficiency;
        this.batteryLevel = batteryLevel;
    }


    public double getBatteryCapacity() {
        return batteryCapacity;
    }


    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }


    public double getEfficiency() {
        return efficiency;
    }


    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public String getType(){
        return "Auto electrico";
    }

    public double calculateRange(){
        return batteryCapacity * efficiency;
    }

    public int getBatteryLevel(){
        return batteryLevel;
    }

    public void recharge(){
        batteryLevel = 100;
        System.out.println(getModel() + " Bateria cargada");
    }


    @Override
    public String toString() {
        return "ElectricCar [batteryCapacity=" + batteryCapacity + ", efficiency=" + efficiency + ", batteryLevel="
                + batteryLevel + "]";
    }

}
