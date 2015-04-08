
public class ServiceNotAvailableAtTheMoment extends Exception {

	public ServiceNotAvailableAtTheMoment(String m) {
		super(m);
	}
	
	public void useService() throws ServiceNotAvailableAtTheMoment {
		throw new ServiceNotAvailableAtTheMoment("You have problems with internet");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
