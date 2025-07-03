import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

public class ReadAppendedFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("byteOutput.txt"));
            String line;

            System.out.println("Contents of byteOutput.txt");
            while((line = reader.readLine()) !=null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        }
    }
}
