import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    copyFile("assets/firstFile.txt", "assets/firstFile2.txt");
  }

  public static Boolean copyFile(String copyFrom, String copyTo) {
    Path copyFromPath = Paths.get(copyFrom);
    Path copyToPath = Paths.get(copyTo);
    List<String> content;
    try {
      content = readAllLinesFromFile(copyFromPath);
    } catch (IOException e) {
      return false;
    }
      if (writeAllLinesToFile(copyToPath, content)) {
          return true;
      } else {
          return false;
      }
  }

  public static List<String> readAllLinesFromFile(Path filePath) throws IOException {
    List<String> content;
    try {
      content = Files.readAllLines(filePath);
    } catch (IOException e) {
      throw e;
    }
    return content;
  }

  public static boolean writeAllLinesToFile(Path filePath, List<String> content) {
    try {
      Files.write(filePath, content);
    } catch (IOException e) {
      return false;
    }
    return true;
  }

}
