/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

	public static void main(String[] args) {
		Person person = new PersonBuilder().withFirstName("Jaroslav").withLastName("Crhonek")
				.withEmailAddress("crhonek@cngroup.dk").withCountry("Czech").build();

        System.out.println(person);
    }
}
