package test.vk.page.friends;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.vk.page.VKBasePage;
import test.vk.page.friend.FriendPage;

public class FriendsListPage extends VKBasePage {
	String friendHref = config.friendHref();
	final By friendPageLinkSelector = 
			By.xpath("//a[contains(@href, '" + friendHref + "')]");
	
	public FriendsListPage(WebDriver driver) {
		super(driver);
	}

	public FriendPage toFriendPage() {
		waitToLoadElement(friendPageLinkSelector);
		driver.findElement(friendPageLinkSelector).click();
		
		return new FriendPage(driver);
	}
}
