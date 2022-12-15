package NEW_FRAMES;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver driver;
  @Test(dataProvider = "Suresh")
  public void f(String n, String s) throws InterruptedException {
	    Thread.sleep(8000);
	    driver.findElement(By.name("username")).sendKeys(n);
	    driver.findElement(By.name("password")).sendKeys(s);
	    driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(8000);
        driver.findElement(By.xpath("//*[text()='Logout']")).click();
        System.out.println("logout");
        Thread.sleep(8000);
  }

  @DataProvider
  public Object[][] Suresh() {
	  
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin123" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
