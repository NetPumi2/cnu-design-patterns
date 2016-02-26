/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Starting the application");

        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager1 == singletonEager2);

        FactoryMethod factoryMethod1 = FactoryMethod.getInstance();
        FactoryMethod factoryMethod2 = FactoryMethod.getInstance();
        System.out.println(factoryMethod1 == factoryMethod2);

        System.out.println("Stopping the application");
    }
}
