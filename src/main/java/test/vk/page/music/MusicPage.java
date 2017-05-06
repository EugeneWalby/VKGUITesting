package test.vk.page.music;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.vk.page.VKBasePage;

public class MusicPage extends VKBasePage {
	final By firstTrackLinkSelector = 
			By.xpath("//*[@class='audio_row_cover']");
	final By pauseLabelSelector = 
			By.xpath("//div[contains(@class, 'audio_row_playing')]");
	
	public MusicPage(WebDriver driver) {
		super(driver);
	}
	
	public void playFirstTrack() {
		waitToLoadElement(firstTrackLinkSelector);
		driver.findElement(firstTrackLinkSelector).click();
		waitToLoadElement(pauseLabelSelector);
	}
	
	public WebElement getPlayingLabel() {
		return driver.findElement(pauseLabelSelector);
	}
}
