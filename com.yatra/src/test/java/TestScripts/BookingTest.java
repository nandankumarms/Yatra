package TestScripts;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.yatra.genericLibrary.BaseTest;
import com.yatra.genericLibrary.ReadTestData;

public class BookingTest  extends BaseTest{

	@DataProvider(name="TestData")
	public String[][] testData() throws EncryptedDocumentException, IOException {
		return ReadTestData.readData("Place");
	}

	
	@Test(dataProvider = "TestData")
	public  void yatraTest(String fromPlace, String toPlace) {
		       //Switch to iframe if present
				//driver.switchTo().frame("notification-frame-~10cb42c72");
				//Close notification window
				//driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
				
				//Come back to parent iframe
				//driver.switchTo().parentFrame();
				
		//Click on buses
		driver.findElement(By.xpath("//span[text()='Buses']")).click();
		
		//Click on from place
		driver.findElement(By.id("BE_bus_from_station")).click();
		

		//Select from address
		List<WebElement> fromPoint = driver.findElements(By.xpath("//div[@class='viewport']/div/div/li"));
		
		for(WebElement from:fromPoint) {
			System.out.println(from.getText());
			if(from.getText().equalsIgnoreCase(fromPlace)) {
				from.click();
				break;
				
			}
		}
			
		//Select To address
		List<WebElement> toPoint = driver.findElements(By.xpath("//div[@class='viewport']/div/div/li"));
			for(WebElement to:toPoint) {
				System.out.println(to.getText());
				if(to.getText().equalsIgnoreCase(toPlace)) {
					to.click();
					break;
					
				}
		
		}
			
			//click on search buses
			driver.findElement(By.id("BE_bus_search_btn")).click();
		
	}

}
