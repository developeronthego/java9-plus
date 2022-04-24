package jdk.java11.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesChanges {

	public static void main(String[] args) throws IOException {
		Path filePath = Files.writeString(Path.of("note.txt"), "My new note on blog.");
		String fileContent = Files.readString(filePath);
		System.out.println(fileContent);
	}

}
