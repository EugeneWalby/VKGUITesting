package test.vk.page.friend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.vk.page.VKBasePage;
import test.vk.page.message.MessageWindow;

public class FriendPage extends VKBasePage {
	final By writeMessageButtonSelector = 
			By.xpath("//*[@class='button_link cut_left']");
	
	public FriendPage(WebDriver driver) {
		super(driver);
	}
	
	public MessageWindow toMessageWindow() {
		waitToLoadElement(writeMessageButtonSelector);
		driver.findElement(writeMessageButtonSelector).click();
		
		return new MessageWindow(driver);
	}
}
