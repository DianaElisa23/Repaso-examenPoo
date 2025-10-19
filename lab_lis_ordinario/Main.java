package lab_lis_ordinario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> computers =  new ArrayList<>();

        Computer c1 = new Desktop("2020", "IBM", "Linux", 40.0);
        Computer c2 = new Laptop("2024", "HP", "Win", 5000, 2.3);
        Computer c3 = new Notebook("2022", "Apple", "MacOs", 4000, 1.2);

        computers.add(c1);
        computers.add(c2);
        computers.add(c3);

        for(Computers c : computers){
            System.out.println(computers);
        }
    }
}
 