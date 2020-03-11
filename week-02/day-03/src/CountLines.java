import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        System.out.println(count("assets/my-file.txt"));
    }

    public static int count(String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (Exception e) {
            return 0;
        }
    }
}
