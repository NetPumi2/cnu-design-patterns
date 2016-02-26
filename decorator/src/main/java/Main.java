import org.apache.commons.io.IOUtils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		InputStream is = Main.class.getResourceAsStream("text.gz");
		BufferedInputStream bis = new BufferedInputStream(is);
		GZIPInputStream gis = new GZIPInputStream(bis);

		String string = IOUtils.toString(gis, StandardCharsets.UTF_8);

		System.out.println(string);
	}

}
