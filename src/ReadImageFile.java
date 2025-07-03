import java.io.FileInputStream;
import java.io.IOException;

public class ReadImageFile {
    public static void main(String[] args) {
        String fileName = "/Users/toktobek/Downloads/city.jpg";

        try(FileInputStream inputStream = new FileInputStream(fileName)) {
            int byteCount = 0;
            int byteData;

            System.out.println("Reading byte from: " + fileName);

            while ((byteData = inputStream.read()) !=-1) {
                System.out.println(byteData + " ");
                byteCount++;

                if (byteCount >= 100) {
                    System.out.println("\n... truncated output after 100 bytes");
                    break;
                }
            }
            System.out.println("\n Read complete. Total bytes read(limited): " + byteCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
