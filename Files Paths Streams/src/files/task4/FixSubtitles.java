package files.task4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class FixSubtitles {
	
	public void FixYourSubtitles(Path path) throws IOException {
		File myFile = path.toFile();
		
		File newFile = new File("newSubs.txt");
		
		if (!newFile.exists())
			newFile.createNewFile();
		
		byte[] BitesFromFile = Files.readAllBytes(path);
		BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFile), "UTF-8"));
		buff.write(new String(BitesFromFile, "Windows-1251"));
	}
}


