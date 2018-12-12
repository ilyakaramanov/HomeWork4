package ua.org.oa.ilyakaramanov;

/**
 * Класс легковой автомобиль наследуется от супер класса
 * Метод displayСost вычисляет стоимостью ниже указанного значения
 */

public class Sedan extends Car {

    private int cost;

    Sedan(String brand, String name, String color, int cost) {
        super.name = name;
        super.color = color;
        super.brand = brand;
        this.cost = cost;
    }

    //

    void displayСost(int approximateCost) {
        if (cost <= approximateCost) {
            System.out.println("Легковые автомобили с ценой ниже " + approximateCost + " - " + brand + " " + name);
        }
    }

    @Override
    void displayLoad(int minLoad, int maxLoad) {

    }

    @Override
    void displaySpeed(int topSpeed) {

    }

}
