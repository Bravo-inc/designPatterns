package mk.p.factory;

public class CarFactory {
    private int sedanCarCout = 0;
    private int crossoverCarCount = 0;
    private int vanCarCount = 0;

    public CarBuild getCarType(CarTypes types) {
        CarBuild toReturn = null;
        switch (types) {
            case SEDAN:
                sedanCarCout++;
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
                throw new IllegalArgumentException("Wrong car types:" + types);
        }
        return toReturn;
    }

    public void printCount() {
        System.out.println("Sedan: " + sedanCarCout);
        System.out.println("Crossover: " + crossoverCarCount);
        System.out.println("Van: " + vanCarCount);
        System.out.println("Total: " + (sedanCarCout + crossoverCarCount + vanCarCount));
    }
}