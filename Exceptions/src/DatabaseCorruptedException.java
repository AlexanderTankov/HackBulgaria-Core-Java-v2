
public class DatabaseCorruptedException extends RuntimeException {

	public DatabaseCorruptedException(String m) {
		super(m);
	}
	
	public static void addToDB() throws DatabaseCorruptedException {
		throw new DatabaseCorruptedException("This is my Exception");
	}
	
	public static void main(String[] args) {
		try {
			addToDB();
		} catch (DatabaseCorruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
