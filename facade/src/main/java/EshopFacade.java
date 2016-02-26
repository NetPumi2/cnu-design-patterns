import java.math.BigDecimal;

/**
 * Created by crhonek on 26.2.2016.
 */
public class EshopFacade {

    private CustomerManager customerManager = new CustomerManager();
    private OrderManager orderManager = new OrderManager();

    public void registerCustomer(String customerName){
        customerManager.addCustomer(customerName);
    }

    public void registerOrder(BigDecimal amount){
        orderManager.registerOrder(amount);
    }
}
