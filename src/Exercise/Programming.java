package Exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Programming {
    public static void main(String[] args) {
        File myFile = new File("programming.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("Created file is successful.");
            } else {
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path pFile = Paths.get("myName.txt");

        try {
            BufferedWriter writer = Files.newBufferedWriter(pFile, StandardCharsets.UTF_8);
            for (int i = 1 ; i <=10;i++) {
                writer.write("5+5=10"+(i+1));
                writer.newLine();

            }writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
