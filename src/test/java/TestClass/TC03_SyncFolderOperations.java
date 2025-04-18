package TestClass;

import org.nexus.base.BaseTest;
import org.testng.annotations.Test;

import PageClass.P03_SyncFolderPage;

public class TC03_SyncFolderOperations extends BaseTest{
	
	@Test(priority = 0, groups= {"FolderOps","P0"})
	public void validateCreateFolderFunctionalty() throws InterruptedException{
		P03_SyncFolderPage fp = new P03_SyncFolderPage(driver);
		fp.openUrl("https://cp.sync.com");
		fp.loginToSyncApp("sandipthopate1414+test@gmail.com","asdf1234");
		Thread.sleep(2000);
		fp.clickNewFolderButton();
		Thread.sleep(2000);
		fp.enterFolderName("abcde");
		Thread.sleep(2000);
		fp.clickAddFolderButton();
		Thread.sleep(2000);
		fp.checkFolderIsPresent("abcde");
		Thread.sleep(2000);
		
	}
	
	@Test(priority =1, groups= {"FolderOps"})
	public void validateRenameFolderFunctionality()throws InterruptedException{
		P03_SyncFolderPage fp = new P03_SyncFolderPage(driver);
		fp.openUrl("https://cp.sync.com");
		fp.loginToSyncApp("sandipthopate1414+test@gmail.com","asdf1234");
		Thread.sleep(2000);
		fp.checkFolderIsPresent("abcde");
		Thread.sleep(2000);
		fp.clickFolderThreeDotsDropdown("abcde");
		Thread.sleep(2000);
		fp.clickRenameDropdownOption("abcde");
		Thread.sleep(2000);
		fp.enterRenameField("abcdef");
		Thread.sleep(2000);
		fp.clickRenameButton();
		Thread.sleep(2000);
		fp.checkFolderIsPresent("abcde");
		Thread.sleep(2000);
	}
	
	@Test(priority =3, groups= {"FolderOps"})
	public void validateDeleteFolderFunctionality()throws InterruptedException{
		P03_SyncFolderPage fp = new P03_SyncFolderPage(driver);
		fp.openUrl("https://cp.sync.com");
		fp.loginToSyncApp("sandipthopate1414+test@gmail.com","asdf1234");
		Thread.sleep(2000);
		fp.checkFolderIsPresent("xyz");
		Thread.sleep(2000);
		fp.clickFolderThreeDotsDropdown("xyz");
		Thread.sleep(2000);
		fp.clickDeleteFileDropdownButton("xyz");
		Thread.sleep(2000);
		fp.clickConfirmDeleteDialogButton();
		Thread.sleep(2000);
	}
}
