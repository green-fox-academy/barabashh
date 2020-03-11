import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Collections;

public class WriteSingleLine {
    public static void main(String[] args) {
        Path filePath = Paths.get("assets/my-file.txt");
        String myName = "Gabor Barancsi";
        try {
            Files.write(filePath, Collections.singleton(myName));
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
