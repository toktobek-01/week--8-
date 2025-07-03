import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BackUpDeliveries {
    public static void main(String[] args) {
        String sourceFile = "deliveries.txt";
        String backupFile = "backup.txt";

        try (
                FileInputStream input = new FileInputStream(sourceFile);
                FileOutputStream output = new FileOutputStream(backupFile)
                ) {
            int byteData;
            while((byteData = input.read()) !=-1) {
                output.write(byteData);
            }

            System.out.println("Backup complete! " + backupFile + " created.");
        } catch (IOException e) {
            System.out.println("Error during backup: " + e.getMessage());
        }
    }
}
