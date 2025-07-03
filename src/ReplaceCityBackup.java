import java.io.*;

public class ReplaceCityBackup {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("deliveries.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("backup.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace("Dallas", "San Antonio");
                String lineTwo = line.replace("Houston", "Chicago");

                writer.write(modifiedLine);
                writer.newLine();
            }
            reader.close();
            writer.close();

                System.out.println("backup.txt created with city name updated...");
            } catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }

        }
    }

