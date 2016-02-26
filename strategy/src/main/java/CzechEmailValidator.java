/**
 * Created by crhonek on 26.2.2016.
 */
public class CzechEmailValidator implements EmailValidator {
    @Override
    public boolean isEmailValid(String emailAddress) {
        return emailAddress.contains("@") && emailAddress.endsWith(".cz");
    }
}
