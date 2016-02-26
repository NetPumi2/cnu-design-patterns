package internal;

import external.EmailValidator;

/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) {
        EmailValidatorLoggingProxy proxy = new EmailValidatorLoggingProxy(new EmailValidator());

        Validator validator = new Validator(proxy);
        boolean emailValid = validator.isEmailValid("crhonek@cngroup.dk");

        System.out.println("emailValid: "+emailValid);
    }
}
