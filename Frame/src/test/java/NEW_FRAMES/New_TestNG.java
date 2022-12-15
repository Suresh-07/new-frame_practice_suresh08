package NEW_FRAMES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class New_TestNG {
	WebDriver driver;
	public String title;
	public String URL;
	@BeforeTest
	public void testframe() {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
	@Test(priority = 0, alwaysRun = true)
    public void testcase() {
	title = driver.getTitle();
	Assert.assertEquals("Suresh", "Harsha");
	}
	@Test(priority = 1,dependsOnMethods = "testcase",alwaysRun = true)
     public void testcase2() {
	 URL = driver.getCurrentUrl();
 }
	@Test(priority = 2)
     public void testcase3() {
	 System.out.println(title + URL);
 }
 @AfterTest
 public void AT() {
	 driver.close();
 }

}
