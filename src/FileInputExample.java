import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("users.txt");

            int bytData;
            while((bytData = input.read()) !=-1) {
                System.out.println((char) bytData);
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
