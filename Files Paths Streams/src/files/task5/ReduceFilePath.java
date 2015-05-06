package files.task5;

import java.net.URI;
import java.net.URISyntaxException;


public class ReduceFilePath {
	
	URI reducePath(URI path) throws URISyntaxException {
		return path.normalize();
	}
}
