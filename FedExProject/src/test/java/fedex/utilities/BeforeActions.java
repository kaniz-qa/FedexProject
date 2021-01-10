package fedex.utilities;

import io.cucumber.java.Before;

public class BeforeActions {

	
	
	@Before
	public static void beforeAction() {
		System.out.println("..start..");
		SetupDrivers.setChromeDriver();
	}
	
	
}
