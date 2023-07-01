package TestCases;

import org.testng.annotations.Test;

import com.pomLibrary.BusesPage;
import com.pomLibrary.WelcomePage;
import com.yatra.genericLibrary.BaseTest;


public class BusSearchingTest extends BaseTest {
	@Test
	public void busSearchingTest() {
		WelcomePage welcome=new WelcomePage(driver);
		//welcome.clickBusesLink();
		BusesPage bus=new BusesPage(driver);
		bus.clickFromTextField();
		bus.selectPlace("Bangalore, Karnataka");
		bus.selectPlace("Pune, Maharashtra");
		bus.clickSearchBusesButton();
		
	}

}
