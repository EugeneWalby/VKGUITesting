package test.vk.page.message;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.vk.page.VKBasePage;

public class MessageWindow extends VKBasePage {
	final By messageTextBoxSelector = 
			By.xpath("//*[@id='mail_box_editable']");
	final By sendMessageButtonSelector = 
			By.xpath("//*[@id='mail_box_send']");
	final By successSendingWindowSelector = 
			By.xpath("//*[@class='top_result_header']");
	
	public MessageWindow(WebDriver driver) {
		super(driver);
	}

	public void sendMessage(String msg) {
		waitToLoadElement(messageTextBoxSelector);
		waitToLoadElement(sendMessageButtonSelector);
		writeMessage(msg);
		clickSendMessageButton();
		waitToLoadElement(successSendingWindowSelector);
	}
	
	public String writeMessage(String msg) {
		WebElement messageTextBox = 
				driver.findElement(messageTextBoxSelector);
		messageTextBox.sendKeys(msg);
		
		return messageTextBox.getAttribute("value");
	}
	
	public void clickSendMessageButton() {
		driver.findElement(sendMessageButtonSelector).click();
	}
	
	public WebElement getSuccessSendingWindow() {
		return driver.findElement(successSendingWindowSelector);
	}
}
