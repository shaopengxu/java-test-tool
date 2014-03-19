package googleGuiceTest;

import com.google.inject.Inject;

public class SpecificLogicService implements LogicService {

	DataAccess dataAccess;

	@Inject
	public SpecificLogicService(DataAccess dataAccess) {
		this.dataAccess = dataAccess;
	}

	@Override
	public void toSave(Object obj) {
		dataAccess.save(obj);
	}

}
