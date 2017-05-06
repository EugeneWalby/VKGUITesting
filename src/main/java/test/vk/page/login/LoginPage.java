package test.vk.page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.vk.page.VKBasePage;
import test.vk.page.user.UserPage;

public class LoginPage extends VKBasePage {
	final By emailFieldSelector = By.xpath("//*[@id='email']");
	final By passwordFieldSelector = By.xpath("//*[@id='pass']");
	final By loginButtonSelector = By.xpath("//*[@id='login_button']");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public UserPage logInVK(String login, String pass) {
		typeLogin(login);
		typePassword(pass);
		clickButtonToLogin();
		
		return new UserPage(driver);
	}
	
	public void openPage() {
		String url = config.url();
		driver.get(url);
	}
	
	public String typeLogin(String login) {
		WebElement emailTextField = 
				driver.findElement(emailFieldSelector);
		emailTextField.sendKeys(login);
		
		return emailTextField.getAttribute("value");
	}

	public String typePassword(String pass) {
		WebElement passwordTextField = 
				driver.findElement(passwordFieldSelector);
		passwordTextField.sendKeys(pass);
		
		return passwordTextField.getAttribute("value");
	}

	public void clickButtonToLogin() {
		driver.findElement(loginButtonSelector).submit();
	}	
}
