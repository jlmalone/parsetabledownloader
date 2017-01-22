import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by josephmalone on 2017-01-21.
 */
public class Mn {


    public static void main(String... args)
    {
        try {
            String s = readFile("~/receipt.json");
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
        String         ls = System.getProperty("line.separator");

        try {
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }
}
