package mk.p.singleton.v1;

public class MySingleton {
    private MySingleton() {
        System.out.println("Singleton created");
    }

    public static final MySingleton INSTANCE = new MySingleton();

    public void printName() {
        System.out.println("I am a Singleton");
    }
}