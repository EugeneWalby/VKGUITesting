package test.vk.page.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.vk.page.VKBasePage;
import test.vk.page.friends.FriendsListPage;
import test.vk.page.music.MusicPage;

public class UserPage extends VKBasePage {
	final By friendsLinkSelector = By.xpath("//*[@id='l_fr']");
	final By musicLinkSelector = By.xpath("//*[@id='l_aud']");

	public UserPage(WebDriver driver) {
		super(driver);
	}
	
	public FriendsListPage toFriendsList() {
		waitToLoadElement(friendsLinkSelector);
		driver.findElement(friendsLinkSelector).click();
		
		return new FriendsListPage(driver);
	}
	
	public MusicPage toMusicPage() {
		waitToLoadElement(musicLinkSelector);
		driver.findElement(musicLinkSelector).click();
		
		return new MusicPage(driver);
	}
}
