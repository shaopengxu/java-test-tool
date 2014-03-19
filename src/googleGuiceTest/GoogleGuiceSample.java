package googleGuiceTest;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GoogleGuiceSample {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new InjectModule());
		LogicService logicService = injector.getInstance(LogicService.class);
		logicService.toSave(new Object());
	}
}
