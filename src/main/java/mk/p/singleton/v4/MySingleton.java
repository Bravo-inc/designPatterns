package mk.p.singleton.v4;

public class MySingleton {
    private MySingleton() {
        System.out.println("Singleton created");
    }
    public static MySingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
    private static class SingletonHolder {
        public static final MySingleton HOLDER_INSTANCE = new MySingleton();
    }
}