package DownloadFile;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadFile {
	public static void download(final String url, final String filename) throws IOException {

		File file = new File(filename);
		URL myUrl = new URL(url);
		org.apache.commons.io.FileUtils.copyURLToFile(myUrl, file);

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DownloadFile.download(
				"http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg",
				"lqlq");

	}
}
