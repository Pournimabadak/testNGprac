package TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGwithSelenium {
	//declaration of driver
	static WebDriver driver;

	@BeforeTest
	public void environmentSetUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		//definition of driver
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@BeforeMethod
	public void  urlCount()
	{
		
		Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
		/*
		for (int i = 0; i < driver.findElements(By.tagName("a")).size(); i++) 
				{
					System.out.println(driver.findElements(By.tagName("a")).get(i).getText());
				}*/
	}

	
	@AfterMethod
	public void logout()
	{
		System.out.println("after method");
	}

	@Test(priority = 2)
	public void login()
	{
		driver.findElement(By.name(objectRepository.login_US)).sendKeys("batman");
		driver.findElement(By.name(objectRepository.login_PS)).sendKeys("batman");
		driver.findElement(By.name("login")).click();
	}

	@Test(priority = 3)
	public void radios() throws InterruptedException
	{
		driver.findElement(By.xpath(objectRepository.radios)).click();

	}

	@Test(priority = 4)
	public void dropdown() throws InterruptedException
	{
		driver.findElement(By.xpath(objectRepository.dropdown)).click();
		Thread.sleep(5000);
	}

	@AfterTest
	public void close()
	{
		driver.close();
	}


}
