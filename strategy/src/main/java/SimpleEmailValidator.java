/**
 * Created by crhonek on 26.2.2016.
 */
public class SimpleEmailValidator implements EmailValidator {
    @Override
    public boolean isEmailValid(String emailAddress) {
        return emailAddress.contains("@");
    }
}
