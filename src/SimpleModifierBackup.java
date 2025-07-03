import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleModifierBackup {
    public static void main(String[] args) {
        try {
            // ✅ Correct: FileReader used with BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader("deliveries.txt"));

            // ✅ Correct: FileWriter used with BufferedWriter
            BufferedWriter writer = new BufferedWriter(new FileWriter("backup.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String upper = line.toUpperCase(); // make uppercase
                writer.write(upper);
                writer.newLine(); // new line in backup
            }

            reader.close();
            writer.close();

            System.out.println("✅ backup.txt created successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
