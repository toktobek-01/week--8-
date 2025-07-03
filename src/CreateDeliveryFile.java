import java.io.FileWriter;
import java.io.IOException;

public class CreateDeliveryFile {
    public static void main(String[] args) {
        String fileName = "deliveries.txt";
        String content = """
                Driver: Ali, Location: Dallas
                Driver: Emily, Location: Austin
                Driver: John, Location: Houston
                """;

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("File created and filled: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
