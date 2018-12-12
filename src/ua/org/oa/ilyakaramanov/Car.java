package ua.org.oa.ilyakaramanov;

/**
 * Создаем супер класс Car с полями и методами
 */

public abstract class Car {

    String name;
    String color;
    String brand;

    abstract void displayСost(int approximateCost);

    abstract void displayLoad(int minLoad, int maxLoad);

    abstract void displaySpeed(int topSpeed);
}

