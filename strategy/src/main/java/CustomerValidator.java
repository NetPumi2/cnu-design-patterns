/**
 * Created by crhonek on 26.2.2016.
 */
public class CustomerValidator {

    private EmailValidator simpleEmailValdiator = new SimpleEmailValidator();
    private  EmailValidator czechEmailValidator = new CzechEmailValidator();

    public  boolean isEmailValid(String email){
        if(email.endsWith("cz")){
            return czechEmailValidator.isEmailValid(email);
        } else{
            return simpleEmailValdiator.isEmailValid(email);
        }
    }
}
