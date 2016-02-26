import java.math.BigDecimal;

/**
 * Created by crhonek on 26.2.2016.
 */
public class OrderManager {

    public void registerOrder(BigDecimal amount){
        System.out.println("Registering order for amount: "+amount);
    }

    public void cancelOrder(String orderNumber){
        System.out.println("Cancelling order: "+orderNumber);
    }
}
