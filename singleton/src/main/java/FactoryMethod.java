/**
 * Created by crhonek on 26.2.2016.
 */
public class FactoryMethod {

    private FactoryMethod(){
    }

    public static FactoryMethod getInstance(){
        return new FactoryMethod();
    }
}
