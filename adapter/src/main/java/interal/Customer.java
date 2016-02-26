package interal;

/**
 * Created by crhonek on 26.2.2016.
 */
public class Customer {

    private final String emailAddress;

    public Customer(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("emailAddress='").append(emailAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
