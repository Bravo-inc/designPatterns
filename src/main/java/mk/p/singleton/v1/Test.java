package mk.p.singleton.v1;

/**
 * Simple singleton
 */
public class Test {
    public static void main(String[] args) {
        MySingleton.INSTANCE.printName();
        System.out.println(MySingleton.INSTANCE.getClass());
    }
}