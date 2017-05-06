package test.vk.base;

import java.util.concurrent.TimeUnit;
import org.aeonbits.owner.ConfigFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.vk.page.login.LoginPage;
import test.vk.properties.VKConfig;

public class VKBaseTest {
	protected static WebDriver driver;
	protected static LoginPage loginPage;
	protected static VKConfig config;
	
	@BeforeClass
	public static void openBrowser() {
		config = ConfigFactory.create(VKConfig.class);
	    driver = new FirefoxDriver(); 
	    waitToLoadPage();
	    
	    loginPage = new LoginPage(driver);
	    loginPage.openPage();
	}
	
	protected static void waitToLoadPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}
