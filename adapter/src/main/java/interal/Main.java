package interal;

import adapter.ExternalEmailValidatorAdapter;

/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) {
        Customer cust = new Customer("crhonek@cngrop.dk");
        System.out.println("Validating customer: "+cust);
        CustomerValidator validator = new CustomerValidator(new ExternalEmailValidatorAdapter());
        boolean isValid = validator.isCustomerValid(cust);
        System.out.println("isValid - "+isValid);

    }
}
