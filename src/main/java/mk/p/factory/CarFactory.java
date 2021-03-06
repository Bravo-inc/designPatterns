package mk.p.factory;

public class CarFactory {
    private int sedanCarCount = 0;
    private int crossoverCarCount = 0;
    private int vanCarCount = 0;

    public CarBuild getCarType(CarType type) {
        CarBuild toReturn = null;
        switch (type) {
            case SEDAN:
                sedanCarCount++;
                toReturn = new Sedan();
                break;
            case CROSSOVER:
                crossoverCarCount++;
                toReturn = new Crossover();
                break;
            case VAN:
                vanCarCount++;
                toReturn = new Van();
                break;
            default:
                throw new IllegalArgumentException("Wrong car types:" + type);
        }
        return toReturn;
    }

    public void printCount() {
        System.out.println("Sedan: " + sedanCarCount);
        System.out.println("Crossover: " + crossoverCarCount);
        System.out.println("Van: " + vanCarCount);
        System.out.println("Total: " + (sedanCarCount + crossoverCarCount + vanCarCount));
    }
}