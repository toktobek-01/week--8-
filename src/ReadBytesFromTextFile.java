import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadBytesFromTextFile {
    public static void main(String[] args) {
        String fileName = "byteOutput.txt";

        try(FileInputStream inputStream = new FileInputStream(fileName)) {
            int byteData;

            System.out.println("Reading bytes from: " + fileName);
            System.out.println("---------------------------------");
            while ((byteData = inputStream.read()) != -1) {
                System.out.println("Byte: " + byteData + " | Charater: " + (char) byteData);
            }
        }
        catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }

