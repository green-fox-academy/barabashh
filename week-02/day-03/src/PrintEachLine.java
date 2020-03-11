import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args){
        Path filePath = Paths.get("assets/my-file.txt");
        try{
            List<String> lines = Files.readAllLines(filePath);
            for (String line: lines) {
                System.out.println(line);
            }
        }
        catch (NoSuchFileException e){
            System.out.println("Unable to read file: my-file.txt");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
