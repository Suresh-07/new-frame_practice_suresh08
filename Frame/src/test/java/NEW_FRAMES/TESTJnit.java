package NEW_FRAMES;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTJnit {
	
	 	WebDriver driver;
	 	public String title;
	 	public String URL;
	 	@Before
	 	public void testframe() throws InterruptedException {
	 	WebDriverManager.edgedriver().setup();
	 	driver = new EdgeDriver();
	 	Thread.sleep(5000);
	 	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 	
	 	}
	 	@Test
	     public void testcase() {
	 	title = driver.getTitle();
	 	}
	 	@Test
	  public void testcase2() {
	 	 URL = driver.getCurrentUrl();
	  }
	 	@Test(alwaysRun = true)
	  public void testcase3() {
	 	 System.out.println(title + URL);
	  }
	  @After
	  public void AT() {
	 	 driver.close();
	  }

}
