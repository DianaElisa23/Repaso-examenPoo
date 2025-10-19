package lab_lis_ordinario;

public final class Notebook extends Laptop {
    public Notebook(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
        super(model, manufacturer, operatingSystem, batteryCapacity, weight);
    }

    @Override
    public int calculatePortabilityScore(){
        return 1;
    }

    @Override
    public String getComputerType(){
        return "Computadora-laptop: Notebook";
    }

    @Override
    public String toString() {
        return "Notebook []";
    }
}
