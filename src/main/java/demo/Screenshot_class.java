package demo;
import org.testng.annotations.Test;

import seleniumPackage.Take_Screenshot;

import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;


public class Screenshot_class {
	static WebDriver driver;

	@Test
	public static void screenshot() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.tagName("columbus")).sendKeys("shikhasuppu123@gmail.com");

	}

	@Test
	public void f() {
		System.out.println("buhbubuybuyb7yub7yg8ygtygfvyt");


		driver.get("https://www.facebook.com/");

	}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u6079886\\Desktop\\Shikha\\java_ec\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {


		if(ITestResult.FAILURE==result.getStatus())
		{
			Take_Screenshot.Screenshot("Facebook_Login_Page");
			System.out.println("failurte screenshot taken");
		}

	}

}
