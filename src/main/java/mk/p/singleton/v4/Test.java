package mk.p.singleton.v4;

/**
 * Inner class
 */
public class Test {
    public static void main(String[] args) {
        MySingleton firsInstance = MySingleton.getInstance();
        System.out.println(firsInstance.getClass());

        MySingleton secondInstance = MySingleton.getInstance();
    }
}