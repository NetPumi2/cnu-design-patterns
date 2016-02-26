import java.util.Arrays;
import java.util.List;

/**
 * Created by crhonek on 26.2.2016.
 */
public class Main2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		Object[] result = list.stream().filter(i -> i % 2 == 0).map(i -> i * 5).toArray();
		System.out.println(Arrays.toString(result));

	}
}
