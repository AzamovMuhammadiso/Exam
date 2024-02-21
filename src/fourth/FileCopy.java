package fourth;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {
    public static void main(String[] args) {
        Path source = Paths.get("C:\\myfiles\\source.txt");
        Path copiedFile = Paths.get("copiedFile.txt");
        if (!Files.exists(source)) {
            System.out.println("Source file mavjud emas.");
            return;
        }
        try {
            Files.copy(source, copiedFile);
            System.out.println("File copy qilindi.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
