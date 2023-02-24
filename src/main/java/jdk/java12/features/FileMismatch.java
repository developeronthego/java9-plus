package jdk.java12.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMismatch {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("note.txt");
        Path filePathCopy = Files.copy(filePath, Path.of("copy.txt"));
        System.out.println(Files.mismatch(filePath, filePathCopy)); // -1 means that files are equal

        Path differentFile = Files.writeString(Files.createTempFile("changes", ".txt"),
                Files.readString(filePath) + "Some change.");
        System.out.println(Files.mismatch(filePath, differentFile));
    }
}
