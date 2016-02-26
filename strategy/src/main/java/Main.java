/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) {
        CustomerValidator customerValidator = new CustomerValidator();
        boolean result = customerValidator.isEmailValid("crhonek@cngroup.cz");
        System.out.println("Email valid: "+result);
    }
}
