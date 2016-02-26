package internal;

import external.EmailValidator;

/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) {
        Validator validator = new Validator(new EmailValidatorLoggingProxy());
        boolean emailValid = validator.isEmailValid("crhonek@cngroup.dk");

        System.out.println("emailValid: "+emailValid);
    }
}
