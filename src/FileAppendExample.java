import java.io.FileOutputStream;
import java.io.IOException;

public class FileAppendExample {
    public static void main(String[] args) {
        String text = ". Append line using FileOutputStream. \n";

        try {
            FileOutputStream output = new FileOutputStream("byteOutput.txt", true);
            output.write(text.getBytes());
            output.close();

            System.out.println("Line appended to file");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
