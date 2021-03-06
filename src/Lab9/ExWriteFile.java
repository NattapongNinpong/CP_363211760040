package Lab9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//1.สร้างไฟล์ ชื่อ myName.txt
//2.เขียนข้อมูล ชื่อ นามสกุล ภาษาอังกฤษ ลงไปในไฟล์ myName.txt
public class ExWriteFile {
    public static void main(String[] args) {
        File myFile = new File("myName.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("Created file is successful.");
            } else {
                System.out.println("Can not created file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Path pFile = Paths.get("myName.txt");

        try {
            BufferedWriter writer = Files.newBufferedWriter(pFile, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            writer.write("Nattapong Ninpong");
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
