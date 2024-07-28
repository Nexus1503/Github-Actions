package TestClass;

import org.nexus.base.BaseTest;
import org.testng.annotations.Test;

import PageClass.P01_SyncLoginPage;

public class T01_SyncLoginTest extends BaseTest {
	
	@Test(priority = 0, groups= {"Login","P0"})
	public void signInWithCorrectCredentialsTest() throws InterruptedException {
		P01_SyncLoginPage lp = new P01_SyncLoginPage(driver);
		lp.openUrl("https://cp.sync.com");
		lp.enterUsername("sandipthopate1414+test@gmail.com");
		lp.enterPassword("asdf1234");
		lp.clickSignInButton();
		Thread.sleep(5000);
	}
	
	//@Test(priority = 1)
	public void signInWithIncorrectPasswordTest() throws InterruptedException {
		P01_SyncLoginPage lp = new P01_SyncLoginPage(driver);
		lp.openUrl("https://cp.sync.com");
		lp.enterUsername("sandipthopate1414+test@gmail.com");
		lp.enterPassword("asdf1234123");
		lp.clickSignInButton();
		Thread.sleep(5000);
	}
	
	//@Test(priority = 2)
	public void signInWithIncorrectUsernameTest() throws InterruptedException {
		P01_SyncLoginPage lp = new P01_SyncLoginPage(driver);
		lp.openUrl("https://cp.sync.com");
		lp.enterUsername("sandipthopate1414+test1414@gmail.com");
		lp.enterPassword("asdf1234");
		lp.clickSignInButton();
		Thread.sleep(5000);
	}
	
	@Test(priority = 3, groups= {"Login"})
	public void signoutFromSyncTest() throws InterruptedException {
		P01_SyncLoginPage lp = new P01_SyncLoginPage(driver);
		lp.openUrl("https://cp.sync.com");
		lp.enterUsername("sandipthopate1414+test@gmail.com");
		lp.enterPassword("asdf1234");
		lp.clickSignInButton();
		Thread.sleep(5000);
		lp.clickAccountSection();
		lp.clickSignOut();
		Thread.sleep(5000);
	}
}
