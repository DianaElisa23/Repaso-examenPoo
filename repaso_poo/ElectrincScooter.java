

public class ElectrincScooter extends Vehicle implements Rechargeable{
    private double batteryCapacity;
    private double consumption;
    private int batteryLevel;

    public ElectrincScooter(String brand, String model, int year, double batteryCapacity, double consumption, int batteryLevel) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
        this.consumption = consumption;
        this.batteryLevel = batteryLevel;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
    
    public String getType(){
        return "Scooter electrico";
    }

    public double calculateRange(){
        return (batteryCapacity * 1000) / consumption;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void recharge() {
        batteryLevel = 100;
        System.out.println(getModel() + " recargado al 100%.");
    }

    @Override
    public String toString() {
        return "ElectrincScooter [batteryCapacity=" + batteryCapacity + ", consumption=" + consumption
                + ", batteryLevel=" + batteryLevel + "]";
    }


}
