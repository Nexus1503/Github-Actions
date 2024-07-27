package TestClass;

import org.nexus.base.BaseTest;
import org.testng.annotations.Test;

import PageClass.P02_SyncCreateFilePage;

public class T02_SyncCreateFileTest extends BaseTest{
	
	
	@Test(priority = 0)
	public void validateCreateFileFunctionality() throws InterruptedException {
		P02_SyncCreateFilePage fp = new P02_SyncCreateFilePage(driver);
		fp.openUrl("https://cp.sync.com");
		fp.loginToSyncApp("sandipthopate1414+test@gmail.com","asdf1234");
		Thread.sleep(2000);
		fp.clickCreateFileLink();
		Thread.sleep(2000);
		fp.enterFileName("abcd");
		Thread.sleep(2000);
		fp.clickCreateFileButton();
		Thread.sleep(2000);
		fp.checkIfFileIsPresent();
		Thread.sleep(2000);
	}
	
	@Test(priority =1)
	public void validateDeleteFileFunctionality() throws InterruptedException {
		P02_SyncCreateFilePage fp = new P02_SyncCreateFilePage(driver);
		fp.openUrl("https://cp.sync.com");
		fp.loginToSyncApp("sandipthopate1414+test@gmail.com","asdf1234");
		fp.checkIfFileIsPresent();
		fp.clickThreeDots();
		fp.clickOnDeleteOption();
		fp.clickOnDeleteButton();
		Thread.sleep(10000);
	}
	

}
