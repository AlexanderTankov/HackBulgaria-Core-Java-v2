import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;


public class FileUtils {

	private static FileUtils instance = null;
	
	public static FileUtils getInstance() {
		if (instance == null) {
			instance = new FileUtils();
		}
		return instance;
	}
	
	private FileUtils() {
	}
	
	public String readFrom(File file) throws IOException {
		StringBuilder result = new StringBuilder();
		FileReader reader = new FileReader(file);
		BufferedReader buf = new BufferedReader(reader);
		
		boolean flag = true;
		while(flag) {
			String temp = buf.readLine();
			if(temp != null) {
				result.append(temp + "\n");
			} else {
				result.deleteCharAt(result.length() - 2);
				result.deleteCharAt(result.length() - 1);
				flag = false;
			}
		}
	
		
		return result.toString();
	}
	
	public String readFrom(Path path) throws IOException {
		File result = path.toFile();
		return readFrom(result);
	}
	
	public void writeIn(String text, File file) throws IOException {
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter reader = new FileWriter(file);
		BufferedWriter buf = new BufferedWriter(reader);
		
		buf.write(text);
		buf.close();
	}
	
	public void writeIn(String text, Path path) throws IOException {
		File result = path.toFile();
		writeIn(text, result);
	}
	
	public static void main(String[] args) throws IOException {
		File asd = new File("asd.txt");
		FileUtils fu = getInstance();
		fu.writeIn("Alex shte si hodi dovechera. \n Az shte si hodq utre.", asd);
		System.out.println(fu.readFrom(asd));

	}

}
