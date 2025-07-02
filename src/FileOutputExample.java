import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {
        String text = "This is a test using FileOutputStream";

        try {
            FileOutputStream output = new FileOutputStream("byteOutput.txt");

            output.write(text.getBytes());
            output.close();

            System.out.println("File written using FileOutputStream.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
