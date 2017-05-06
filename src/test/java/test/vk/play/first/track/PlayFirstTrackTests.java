package test.vk.play.first.track;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import test.vk.base.VKBaseTest;
import test.vk.page.music.MusicPage;
import test.vk.page.user.UserPage;

public class PlayFirstTrackTests extends VKBaseTest {
	@Test
	public void checkMessageSending() {
		String email = config.email();
		String password = config.password();
		
		UserPage userPage = loginPage.logInVK(email, password);
		MusicPage musicPage = userPage.toMusicPage();
		musicPage.playFirstTrack();
		
		assertTrue(musicPage.getPlayingLabel().isDisplayed());
	}
}
