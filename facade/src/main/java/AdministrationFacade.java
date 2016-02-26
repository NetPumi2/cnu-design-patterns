import java.math.BigDecimal;

/**
 * Created by crhonek on 26.2.2016.
 */
public class AdministrationFacade {

    private CustomerManager customerManager = new CustomerManager();
    private OrderManager orderManager = new OrderManager();

    public void addCustomer(String customerName){
        customerManager.addCustomer(customerName);
    }

    public void deleteCustomer(String customerName){
        customerManager.deleteCustomer(customerName);
    }

    public void registerOrder(BigDecimal amount){
        orderManager.registerOrder(amount);
    }

    public void cancelOrder(String orderNumber){
        orderManager.cancelOrder(orderNumber);
    }
}
