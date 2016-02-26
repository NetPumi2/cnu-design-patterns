package jdkproxy;

import external.EmailValidator;
import external.IEmailValidator;

/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) {
        IEmailValidator emailValidatorProxy = (IEmailValidator) AuditProxy.newInstance(new EmailValidator());
        emailValidatorProxy.isEmailAddressValid("crhonek@cngroup.dk");
    }
}
