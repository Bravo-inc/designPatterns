package mk.p.singleton.v5;

/**
 * Enums the constructor is private by default
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(MySingleton.INSTANCE);
        System.out.println(MySingleton.INSTANCE);
    }
}