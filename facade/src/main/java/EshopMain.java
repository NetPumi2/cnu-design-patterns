import java.math.BigDecimal;

/**
 * Created by crhonek on 26.2.2016.
 */
public class EshopMain {

    private static EshopFacade eshopFacade = new EshopFacade();

    public static void main(String[] args) {
        eshopFacade.registerCustomer("Jaroslav");
        eshopFacade.registerOrder(BigDecimal.TEN);
    }
}
