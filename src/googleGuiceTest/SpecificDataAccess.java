package googleGuiceTest;

public class SpecificDataAccess implements DataAccess {

	@Override
	public void save(Object obj) {
		System.out.println("saving.. " + obj);
	}
}
