import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDeliveries {
    public static void main(String[] args) {
        String sourceFile = "deliveries.txt";
        String zipFile = "deliveries.zip";

        try (
            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);
            FileInputStream fis =  new FileInputStream(sourceFile);
        ) {
            ZipEntry zipEntry = new ZipEntry(sourceFile);
            zos.putNextEntry(zipEntry);

            byte[] buffer = new byte[1024];
            int length;

            while((length = fis.read(buffer)) >= 0) {
                zos.write(buffer, 0, length);
            }
            zos.closeEntry();
            System.out.println("File compressed successfully: " + zipFile);
        } catch (IOException e) {
            System.out.println("Compression error: " + e.getMessage());
        }
    }
}
