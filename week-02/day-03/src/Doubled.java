import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        System.out.println(decryptFile("assets/duplicated-chars.txt", "assets/decryptedFile.txt"));
    }

    public static Boolean decryptFile(String fileToDecrypt, String writeTheDecryptedFileTo) {
        Path fileToDecryptPath = Paths.get(fileToDecrypt);
        Path writeTheDecryptedFileToPath = Paths.get(writeTheDecryptedFileTo);
        List<String> contentToDeCrypt;
        List<String> contentToWrite = new ArrayList<>();
        try {
            contentToDeCrypt = Files.readAllLines(fileToDecryptPath);
        } catch (Exception e) {
            return false;
        }

        for (String line : contentToDeCrypt) {
            String tempLine = "";
            for (int i = 0; i < line.length(); i++) {
                if (i % 2 == 0) tempLine += line.charAt(i);
            }
            contentToWrite.add(tempLine);
        }
        try {
            Files.write(writeTheDecryptedFileToPath, contentToWrite);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
