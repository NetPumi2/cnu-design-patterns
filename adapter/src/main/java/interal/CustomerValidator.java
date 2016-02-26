package interal;

/**
 * Created by crhonek on 26.2.2016.
 */
public class CustomerValidator {

    private EmailValidator emailValidator;

    public CustomerValidator(EmailValidator emailValidator) {
        this.emailValidator = emailValidator;
    }

    public boolean isCustomerValid(Customer customer){
        return emailValidator.isValid(customer.getEmailAddress());
    }
}
