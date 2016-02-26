package external;

import java.util.regex.Pattern;

/**
 * Created by crhonek on 26.2.2016.
 */
public class EmailValidator implements IEmailValidator {

	private static final String EMAIL_REGEXP =
			"^[_\\-\\+A-Za-z0-9]+([.][_\\-\\+A-Za-z0-9]+)*@[A-Za-z0-9]+([_.\\-][A-Za-z0-9]+)*\\.[A-Za-z]{2,}$";
	private static final Pattern emailPattern = Pattern.compile(EMAIL_REGEXP);

	@Override
	public boolean isEmailAddressValid(String emailAddress) {
		return emailPattern.matcher(emailAddress).matches();
	}
}
