/**
 * Created by crhonek on 26.2.2016.
 */
public class PersonBuilder {

    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public PersonBuilder withFirstName(String firstName){
        person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder withLastName(String lastName){
        person.setLastName(lastName);
        return this;
    }

    public PersonBuilder withEmailAddress(String emailAddress){
        person.setEmailAddress(emailAddress);
        return this;
    }

    public PersonBuilder withCountry(String country){
        person.setCountry(country);
        return this;
    }

    public Person build(){
        return person;
    }
}
