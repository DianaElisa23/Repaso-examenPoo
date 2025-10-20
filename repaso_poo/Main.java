
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> listaVehicles = new ArrayList<>();

        Vehicle v1 = new ElectricCar("Tesla", "Model 3", 2023, 60, 6.2, 80);
        Vehicle v2 = new ElectricCar("Nissan", "Leaf", 2022, 40, 5.8, 70);
        Vehicle v3 = new ElectrincScooter("Xiaomi", "MiScooter", 2025, 50, 20, 30);

        listaVehicles.add(v1);
        listaVehicles.add(v2);
        listaVehicles.add(v3);

        for (Vehicle v : listaVehicles) {
            System.out.println(v.toString());
        }
    }
}
