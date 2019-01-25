package mk.p.singleton.v2;

/**
 * Created by call
 */
public class Test {
    public static void main(String[] args) {
        MySingleton firstInstance = MySingleton.getInstance();
        System.out.println(firstInstance.getClass());

        MySingleton secondInstance = MySingleton.getInstance();
        System.out.println(firstInstance == secondInstance);
    }
}