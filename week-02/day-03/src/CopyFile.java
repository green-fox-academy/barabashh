import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copyFile("assets/firstFile.txt", "assets/firstFile2.txt"));
    }

    public static Boolean copyFile(String copyFrom, String copyTo) {
        Path copyFromPath = Paths.get(copyFrom);
        Path copyToPath = Paths.get(copyTo);
        List<String> contentToWrite;
        try {
            contentToWrite = Files.readAllLines(copyFromPath);
        } catch (Exception e) {
            return false;
        }
        try {
            Files.write(copyToPath, contentToWrite);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
