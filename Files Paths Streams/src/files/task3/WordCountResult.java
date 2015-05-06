package files.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;


public class WordCountResult {
	
	private int wordCount;
	private int linesCount;
	private int charCount;
	
	public WordCountResult() {
		this.wordCount = 0;
		this.linesCount = 0;
		this.charCount = 0;
	}
	
	public WordCountResult(int newWordCount, int newLinesCount, int newCharCount) {
		this.wordCount = newWordCount;
		this.linesCount = newLinesCount;
		this.charCount = newCharCount;
	}
	
	public WordCountResult wordCount(Path path) throws IOException {
		BufferedReader buff = new BufferedReader(new FileReader(path.toFile()));
		String line;
		while ((line = buff.readLine()) != null) {
			this.linesCount++;
			
			String[] words = line.split(" ");
			this.wordCount += words.length;
			
			for (int i = 0; i < words.length; i++) {
				this.charCount += words[i].length();
			}
		}
		
		return this;
	}
	
	public static void main(String[] args) throws IOException {
		WordCountResult counter = new WordCountResult();
		Path asd = Paths.get("asd.txt");
		counter.wordCount(asd);
	}

	
}
