package ua.org.oa.ilyakaramanov;

/**
 * Класс грузовик наследуется от супер класса
 * Метод displaySpeed вычисляет скорость выше указанного значения
 */

public class SportCar extends Car {

    private int speed;

    SportCar(String brand, String name, String color, int speed) {
        super.name = name;
        super.color = color;
        super.brand = brand;
        this.speed = speed;
    }

    void displaySpeed(int topSpeed) {
        if (speed > topSpeed) {
            System.out.println("Спорткары со скоростью выше " + topSpeed + " - " + brand + " " + name);
        }

    }

    @Override
    void displayСost(int i) {

    }

    @Override
    void displayLoad(int minLoad, int maxLoad) {

    }
}
