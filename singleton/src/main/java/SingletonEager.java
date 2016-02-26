/**
 * Created by crhonek on 26.2.2016.
 */
public class SingletonEager {

    private static final SingletonEager INSTANCE = new SingletonEager();

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    private SingletonEager(){
    }

    public void doSomething(){
        System.out.println("Doing something in "+getClass());
    }
}
