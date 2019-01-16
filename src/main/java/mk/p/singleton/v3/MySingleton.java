package mk.p.singleton.v3;

public class MySingleton {
    private static volatile MySingleton instance;

    private MySingleton() {
        System.out.println("Singleton created");
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}