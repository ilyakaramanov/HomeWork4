package ua.org.oa.ilyakaramanov;

/**
 * Класс грузовик наследуется от супер класса
 * Метод displayLoad вычисляет грузоподъемность в указанном диапазоне
 */

public class Truck extends Car {

    private int loadCapacity;

    Truck(String brand, String name, String color, int loadCapacity) {
        super.name = name;
        super.color = color;
        super.brand = brand;
        this.loadCapacity = loadCapacity;
    }

    void displayLoad(int minLoad, int maxLoad) {
        if (loadCapacity >= minLoad && loadCapacity <= maxLoad) {
            System.out.println("Грузовики с нужной грузоподъемностью - " + brand + " " + name);
        }
    }

    @Override
    void displaySpeed(int topSpeed) {

    }

    @Override
    void displayСost(int approximateCost) {

    }
}
