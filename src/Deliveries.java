import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Deliveries {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("deliveries.txt"));
            String line;

            while ((line = reader.readLine()) !=null) {
                System.out.println("delivery" + line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

