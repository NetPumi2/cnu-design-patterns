package internal;

import external.EmailValidator;
import external.IEmailValidator;

/**
 * Created by crhonek on 26.2.2016.
 */
public class EmailValidatorLoggingProxy implements IEmailValidator {

    private IEmailValidator emailValidator = new EmailValidator();

    @Override
    public boolean isEmailAddressValid(String emailAddress) {
        System.out.println("Staring the validation of ip address");

        long start = System.nanoTime();
        boolean res = emailValidator.isEmailAddressValid(emailAddress);
        System.out.println("Validation finished with result: "+res+" - validation took: "+(System.nanoTime()-start)+" nanoseconds");

        return res;
    }
}
