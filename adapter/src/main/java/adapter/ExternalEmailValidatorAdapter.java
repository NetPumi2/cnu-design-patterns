package adapter;

import external.ExternalEmailValidator;
import external.ExternalEmailValidatorRequest;
import external.ExternalEmailValidatorResult;
import interal.EmailValidator;

/**
 * Created by crhonek on 26.2.2016.
 */
public class ExternalEmailValidatorAdapter implements EmailValidator {

    private final ExternalEmailValidator externalEmailValidator = new ExternalEmailValidator();

    @Override
    public boolean isValid(String emailAddress) {
        ExternalEmailValidatorRequest request = new ExternalEmailValidatorRequest(emailAddress);
        ExternalEmailValidatorResult result = externalEmailValidator.validateEmail(request);
        return result == ExternalEmailValidatorResult.VALID;
    }
}
