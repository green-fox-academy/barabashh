import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static List<String> content;

  public static void main(String[] args) {
    boolean test = copyFile("assets/firstFile.txt", "assets/firstFile2.txt");
  }

  public static Boolean copyFile(String copyFrom, String copyTo) {
    Path copyFromPath = Paths.get(copyFrom);
    Path copyToPath = Paths.get(copyTo);

    if (readAllLinesFromFile(copyFromPath) && writeAllLinesToFile(copyToPath)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean readAllLinesFromFile(Path filePath) {
    try {
      content = Files.readAllLines(filePath);
    } catch (IOException e) {
      return false;
    }
    return true;
  }

  public static boolean writeAllLinesToFile(Path filePath) {
    try {
      Files.write(filePath, content);
    } catch (IOException e) {
      return false;
    }
    return true;
  }

}
