import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadDeliveries {
    public static void main(String[] args) {
        System.out.println("Using FileInputStream: ");
        try {
            FileInputStream input = new FileInputStream("deliveries.txt");
            int byteData;
            while ((byteData = input.read()) != -1) {
                System.out.print((char) byteData);
            }
            input.close();
        } catch (IOException e) {
            System.out.println("InputStream Error: " + e.getMessage());
        }
        System.out.println("\n\n Using Filereader: ");
        try {
            FileReader reader = new FileReader("deliveries.txt");
            int charData;
            while ((charData = reader.read()) != -1) {
                System.out.println((char) charData);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Filereader error: " + e.getMessage());
        }
    }
}
