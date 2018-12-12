package ua.org.oa.ilyakaramanov;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> allCars = new ArrayList<>();                     //создаем arraylist и объекты классов

        allCars.add(new Sedan("Skoda", "Octavia", "Blue", 25000));
        allCars.add(new Sedan("Toyota", "Corolla", "White", 20000));
        allCars.add(new Sedan("Fiat", "Tipo", "Red", 17000));
        allCars.add(new Sedan("Volkswagen", "Passat", "Grey", 35000));
        allCars.add(new Sedan("Peugeot", "301", "Black", 15000));
        allCars.add(new Truck("Ford", "Cargo", "White", 10000));
        allCars.add(new Truck("Volkswagen", "Crafter", "White", 3000));
        allCars.add(new Truck("Volvo", "FL7", "White", 16000));
        allCars.add(new Truck("Kamaz", "4308-А3", "White", 6000));
        allCars.add(new Truck("Kraz", "5233ВЕ", "White", 6000));
        allCars.add(new SportCar("Ferrari", "Portofino", "Red", 320));
        allCars.add(new SportCar("Lamborghini", "Huracan", "Green", 320));
        allCars.add(new SportCar("Maserati", "GranCabrio", "White", 290));
        allCars.add(new SportCar("Jaguar", "F-Type", "Blue", 275));
        allCars.add(new SportCar("Porsche", "911 GT3", "Black", 310));


        for (Car run : allCars) {                                      //запускаем методы с граничными значениями
            run.displayСost(20000);
            run.displayLoad(15000, 23423324);
            run.displaySpeed(315);
        }

    }
}