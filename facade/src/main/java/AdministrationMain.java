/**
 * Created by crhonek on 26.2.2016.
 */
public class AdministrationMain {

    private static AdministrationFacade administrationFacade = new AdministrationFacade();

    public static void main(String[] args) {
        administrationFacade.addCustomer("Jaroslav");
        administrationFacade.addCustomer("Jirka");
        administrationFacade.deleteCustomer("Jirka");
        administrationFacade.cancelOrder("2016-01-0001");
    }
}
