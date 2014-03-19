package googleGuiceTest;

import com.google.inject.AbstractModule;

public class InjectModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DataAccess.class).to(SpecificDataAccess.class);
		bind(LogicService.class).to(SpecificLogicService.class);

	}

}
