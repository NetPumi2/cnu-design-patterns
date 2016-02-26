/**
 * Created by crhonek on 26.2.2016.
 */
public class SingletonLazy {

    private static SingletonLazy INSTANCE;

    public static SingletonLazy getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }

    private SingletonLazy(){
    }

    public void doSomething(){
        System.out.println("Doing something in "+getClass());
    }
}
