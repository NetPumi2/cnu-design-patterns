package external;

/**
 * Created by crhonek on 26.2.2016.
 */
public class ExternalEmailValidatorRequest {

    private final String emailAddress;

    public ExternalEmailValidatorRequest(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
