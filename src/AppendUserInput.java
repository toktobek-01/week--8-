import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AppendUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "byteOutput.txt";

        try (FileOutputStream outputStream = new FileOutputStream(fileName, true)){
            System.out.println("Enter text to append: ");
            String userInput = scanner.nextLine();
            userInput += "\n";
            outputStream.write(userInput.getBytes());

            System.out.println("Your text was added to: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
