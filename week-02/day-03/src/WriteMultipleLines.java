import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class WriteMultipleLines {
    public static void main(String[] args) {
        writeMultipleLines("assets/firstFile.txt", "apple", 5);
    }

    public static void writeMultipleLines(String path, String word, int number) {
        Path filePath = Paths.get(path);
        ArrayList<String> contentToWrite = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            contentToWrite.add(word);
        }
        try {
            Files.write(filePath, contentToWrite);
        } catch (Exception e) {

        }
    }
}