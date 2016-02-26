package internal;

import external.IEmailValidator;

/**
 * Created by crhonek on 26.2.2016.
 */
public class Validator {

    private IEmailValidator emailValidator;

    public Validator(IEmailValidator emailValidator) {
        this.emailValidator = emailValidator;
    }

    public boolean isEmailValid(String emailAddress){
        return emailValidator.isEmailAddressValid(emailAddress);
    }
}
