package lab_lis_ordinario;

public class Laptop extends Computer implements PortableDevice {
    private int baterryCapacity;
    private double weight;


    public Laptop(String model, String manufacturer, String operatingSystem, int baterryCapacity, double weight) {
        super(model, manufacturer, operatingSystem);
        this.baterryCapacity = baterryCapacity;
        this.weight = weight;
    }


    @Override
    public String getModel(){
        return model;
    }

    public int getBaterryCapacity() {
        return baterryCapacity;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getComputerType(){
        return "Computadora portatil";
    }

    @Override
    public int calculatePortabilityScore(){
        return (int) Math.round(weight);
    }


    @Override
    public String toString() {
        return "Laptop [baterryCapacity=" + baterryCapacity + ", weight=" + weight + "]";
    }

}
