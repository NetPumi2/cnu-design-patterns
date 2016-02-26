/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Starting the application");

        SingletonEager singletonEager = SingletonEager.getInstance();
        singletonEager.doSomething();

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        singletonLazy.doSomething();

        System.out.println("Stopping the application");
    }
}
