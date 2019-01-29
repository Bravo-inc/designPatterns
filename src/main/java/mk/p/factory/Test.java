package mk.p.factory;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        for (int i = 0; i < 100; i++) {
            buildRandomCar(factory);
        }
        factory.printCount();
    }

    private static void buildRandomCar(CarFactory factory) {
        CarBuild randomCar = getRandomCar(factory);
        System.out.printf("Surprise! ");
        randomCar.build();
    }

    private static CarBuild getRandomCar(CarFactory factory) {
        Random random = new Random();
        CarTypes types = CarTypes.values()[random.nextInt(CarTypes.values().length)];
        return (factory.getCarType(types));
    }
}