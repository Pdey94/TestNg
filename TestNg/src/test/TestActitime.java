package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.POMActitimeEnterTimeTrack;
import pom.POMActitimeLoginPage;
import pom.Setting;

public class TestActitime {

	@Test
	public void login()
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe")	;
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com");
	
	POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
	login.loginMethod();
	
	
	
	
	
	
	
	
	}

}
