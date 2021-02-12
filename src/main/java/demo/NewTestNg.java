package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTestNg {
	
private WebDriver driver;
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("http://www.google.com");

      String search_text = "Google Search";
      WebElement search_button = driver.findElement(By.name("btnK"));

      String text = search_button.getAttribute("value");

      Assert.assertEquals(text, search_text, "Text not found!");
  }
  @Test
  public void commands() {
	  		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\u6079886\\Desktop\\Shikha\\java_ec\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
			//WebDriver driver=new ChromeDriver(); 
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getTitle());
			Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
			System.out.println("assert equal passed.");
			Assert.assertNotNull(driver.getTitle());
			System.out.println("assertNotNull passed.");
			Assert.assertNotSame("Facebook", driver.getTitle());
			System.out.println(" assertNotSame passed.");
			Assert.assertNotSame("Failed becz shikha is idiot.", "out ", driver.getTitle());
			System.out.println("NOT SAME");
		
			Assert.assertNotSame("Passed", "Facebook – log in or sign up", driver.getTitle());
			System.out.println("SAME");
			Assert.assertEquals(driver.getTitle().contains("Facebook"), true);
			System.out.println("assertEquals passed.");
			//Assert.assertEquals(driver.getTitle().equals("Facebook"), true);
			//System.out.println("assertEquals passed.");
			Assert.assertTrue(driver.getTitle().contains("Facebook"));
			System.out.println("assertTrue passed.");
			Assert.assertFalse(driver.getTitle().equals("Facebook"));
			System.out.println("assertFalse passed.");
			Assert.assertTrue(driver.getTitle().equals("Facebook"));
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\u6079886\\Desktop\\Shikha\\java_ec\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
