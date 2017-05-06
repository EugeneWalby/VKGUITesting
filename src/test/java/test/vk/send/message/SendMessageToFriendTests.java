package test.vk.send.message;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import test.vk.base.VKBaseTest;
import test.vk.page.friend.FriendPage;
import test.vk.page.friends.FriendsListPage;
import test.vk.page.message.MessageWindow;
import test.vk.page.user.UserPage;

public class SendMessageToFriendTests extends VKBaseTest {
	@Test
	public void checkMessageSending() {
		String email = config.email();
		String password = config.password();
		String message = config.message();
		
		UserPage userPage = loginPage.logInVK(email, password);
		FriendsListPage friendsListPage = userPage.toFriendsList();
		FriendPage friendPage = friendsListPage.toFriendPage();
		MessageWindow messageWindow = friendPage.toMessageWindow();
		messageWindow.sendMessage(message);
		
		assertTrue(messageWindow.getSuccessSendingWindow().isDisplayed());
	}
}
