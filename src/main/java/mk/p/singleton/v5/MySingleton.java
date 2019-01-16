package mk.p.singleton.v5;

/**
 * Enums the constructor is private by default
 **/

public enum MySingleton {
    INSTANCE;

    private MySingleton() {
        System.out.println("Singleton created");
    }
}