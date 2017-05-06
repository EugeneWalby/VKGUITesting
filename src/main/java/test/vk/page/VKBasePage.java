package test.vk.page;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.vk.properties.VKConfig;

public class VKBasePage {
	protected WebDriver driver;
	protected VKConfig config;
	
	public VKBasePage(WebDriver driver) {
		this.driver = driver;
		config = ConfigFactory.create(VKConfig.class);
	}
	
	public void waitToLoadElement(By selector) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
	}
}
