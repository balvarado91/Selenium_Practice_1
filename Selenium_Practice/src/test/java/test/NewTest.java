package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void Test() {
		WebDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/Brj/Documents/Cool_Testers/Selenium_Practice/driver/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
	}
}
