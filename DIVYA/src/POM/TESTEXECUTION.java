package POM;

import org.testng.annotations.Test;

public class TESTEXECUTION extends REPOSITORY {
	@Test
	public void verifylogin() throws InterruptedException {
		REPOSITORY.login();
		Thread.sleep(3000);
	}
}
	