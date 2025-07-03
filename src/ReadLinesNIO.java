import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class ReadLinesNIO {
    public static void main(String[] args) {
        Path filePath = Paths.get("deliveries.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
    }
}
