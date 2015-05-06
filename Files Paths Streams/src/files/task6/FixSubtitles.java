package files.task6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FixSubtitles {
	public void fixEncoding(Path path) throws IOException {

        File myFile = path.toFile();
        byte[] encoded = Files.readAllBytes(Paths.get(myFile.getAbsolutePath()));

        File newFile = new File("encoded.srt");
        if ( !newFile.exists()) {
            newFile.createNewFile();
        }

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(newFile), "UTF-8");
        try (BufferedWriter buff = new BufferedWriter(osw)) {
        	buff.write(new String(encoded, "Windows-1251"));
        }

    }
}
